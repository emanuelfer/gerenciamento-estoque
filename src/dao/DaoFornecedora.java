/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Categoria;
import model.Fornecedora;
import model.Produto;

/**
 *
 * @author 201612030165
 */
public class DaoFornecedora {
    
    private Connection con;  
    
    public Fornecedora busca(int id) {  
        con = ConnectionFactory.getConnection();
	  ResultSet rs = null;
          PreparedStatement stmt = null;
          Fornecedora fornecedora = null;
	try {  
            stmt = con.prepareStatement("SELECT * FROM fornecedora WHERE id = ?");  
            stmt.setInt(1, id);
	    rs = stmt.executeQuery();
            while(rs.next()) { 
                fornecedora = new Fornecedora();
                fornecedora.setId(rs.getInt("id")); 
                fornecedora.setNome(rs.getString("nome")); 
                fornecedora.setEndereco(rs.getString("endereco"));
                fornecedora.setCnpj(rs.getInt("cnpj"));
 
	    }   
	} catch (SQLException e) {  
	    imprimeErro("Erro ao buscar Fornecedora!", e.getMessage());  
	    return null;  
	}finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return fornecedora;
    }  
    
    public void create(Fornecedora fornecedora){   
       con = ConnectionFactory.getConnection();
      PreparedStatement stmt = null;
      
      try {  
         stmt = con.prepareStatement("INSERT INTO fornecedora (nome, cnpj, endereco) VALUES(?,?,?)"); 
         stmt.setString(1, fornecedora.getNome());
         stmt.setInt(2, fornecedora.getCnpj());
         stmt.setString(3, fornecedora.getEndereco());
         stmt.executeUpdate();
         System.out.println("Fornecedora Inserida!");  
      } catch (SQLException e) {  
         imprimeErro("Erro ao inserir Fornecedora!", e.getMessage());  
      } finally {  
         ConnectionFactory.closeConnection(con, stmt);  
      }  
    } 
    
    public void update(Fornecedora fornecedora) {
        con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE fornecedora SET nome = ? ,cnpj = ?,endereco = ? WHERE id = ?");
            stmt.setString(1, fornecedora.getNome());
            stmt.setInt(2, fornecedora.getCnpj());
            stmt.setString(3, fornecedora.getEndereco());
            stmt.setInt(4, fornecedora.getId());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void delete(Fornecedora fornecedora) {
        con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM fornecedora WHERE id = ?");
            stmt.setInt(1, fornecedora.getId());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
    public ArrayList<Fornecedora> mostraFornecedora(){
       con = ConnectionFactory.getConnection();
	  ResultSet rs = null;
          PreparedStatement stmt = null;
          ArrayList<Fornecedora> fornecedora = new ArrayList();
	try {  
            stmt = con.prepareStatement("SELECT * FROM fornecedora");  
	    rs = stmt.executeQuery();
            
            while(rs.next()) { 
                Fornecedora forn = new Fornecedora();
                forn.setId(rs.getInt("id")); 
                forn.setNome(rs.getString("nome")); 
                forn.setEndereco(rs.getString("endereco"));
                forn.setCnpj(rs.getInt("cnpj"));
                fornecedora.add(forn);
	    }   
	} catch (SQLException e) {  
	    imprimeErro("Erro ao buscar pessoa", e.getMessage());  
	    return null;  
	}finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return fornecedora;
   }
    
    public ArrayList<Fornecedora> buscaNome(String nome) {  
        con = ConnectionFactory.getConnection();
	ResultSet rs = null;
        PreparedStatement stmt = null;
        ArrayList<Fornecedora> fornecedora = new ArrayList<Fornecedora>();
	try {  
            stmt = con.prepareStatement("SELECT * FROM fornecedora where  nome like'"+nome+"%'"); 
	    rs = stmt.executeQuery();
            
            while(rs.next()) {  
                DaoCategoria categoria = new DaoCategoria();
                Fornecedora forn = new Fornecedora();
                forn.setId(rs.getInt("id")); 
                forn.setNome(rs.getString("nome")); 
                forn.setEndereco(rs.getString("endereco"));
                forn.setCnpj(rs.getInt("cnpj"));  
                fornecedora.add(forn);
	    }   
	} catch (SQLException e) {  
	    imprimeErro("Erro ao buscar produto!", e.getMessage());  
	    return null;  
	}finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return fornecedora;
    }
    
    
    private void imprimeErro(String msg, String msgErro) {  
      JOptionPane.showMessageDialog(null, msg, "Erro crítico", 0);  
      System.err.println(msg);  
      System.out.println(msgErro);  
      System.exit(0);  
   } 
    
}

