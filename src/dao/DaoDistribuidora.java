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
import model.Distribuidora;
import model.Fornecedora;
import model.Produto;

/**
 *
 * @author 201612030165
 */
public class DaoDistribuidora {
    
    private Connection con;  
    
    public Distribuidora busca(int id) {  
        con = ConnectionFactory.getConnection();
	  ResultSet rs = null;
          PreparedStatement stmt = null;
          Distribuidora distribuidora = null;
	try {  
            stmt = con.prepareStatement("SELECT * FROM distribuidora WHERE id = ?");  
            stmt.setInt(1, id);
	    rs = stmt.executeQuery();
            while(rs.next()) { 
                distribuidora = new Distribuidora();
                distribuidora.setId(rs.getInt("id")); 
                distribuidora.setNome(rs.getString("nome")); 
                distribuidora.setEndereco(rs.getString("endereco"));
                distribuidora.setCnpj(rs.getInt("cnpj"));
 
	    }   
	} catch (SQLException e) {  
	    imprimeErro("Erro ao buscar distribuidora!", e.getMessage());  
	    return null;  
	}finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return distribuidora;
    }  
    
    public void create(Distribuidora distribuidora){   
       con = ConnectionFactory.getConnection();
      PreparedStatement stmt = null;
      
      try {  
         stmt = con.prepareStatement("INSERT INTO distribuidora (nome, cnpj, endereco) VALUES(?,?,?)"); 
         stmt.setString(1, distribuidora.getNome());
         stmt.setInt(2, distribuidora.getCnpj());
         stmt.setString(3, distribuidora.getEndereco());
         stmt.executeUpdate();
         System.out.println("distribuidora Inserida!");  
      } catch (SQLException e) {  
         imprimeErro("Erro ao inserir distribuidora!", e.getMessage());  
      } finally {  
         ConnectionFactory.closeConnection(con, stmt);  
      }  
    } 
    
    public void update(Distribuidora distribuidora) {
        con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE distribuidora SET nome = ? ,cnpj = ?,endereco = ? WHERE id = ?");
            stmt.setString(1, distribuidora.getNome());
            stmt.setInt(2, distribuidora.getCnpj());
            stmt.setString(3, distribuidora.getEndereco());
            stmt.setInt(4, distribuidora.getId());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void delete(Distribuidora distribuidora) {
        con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM distribuidora WHERE id = ?");
            stmt.setInt(1, distribuidora.getId());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
    public ArrayList<Distribuidora> mostraDistribuidora(){
       con = ConnectionFactory.getConnection();
	  ResultSet rs = null;
          PreparedStatement stmt = null;
          ArrayList<Distribuidora> distribuidora = new ArrayList();
	try {  
            stmt = con.prepareStatement("SELECT * FROM distribuidora");  
	    rs = stmt.executeQuery();
            
            while(rs.next()) { 
                Distribuidora dist = new Distribuidora();
                dist.setId(rs.getInt("id")); 
                dist.setNome(rs.getString("nome")); 
                dist.setEndereco(rs.getString("endereco"));
                dist.setCnpj(rs.getInt("cnpj"));
                distribuidora.add(dist);
	    }   
	} catch (SQLException e) {  
	    imprimeErro("Erro ao buscar pessoa", e.getMessage());  
	    return null;  
	}finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return distribuidora;
   }
    
    public ArrayList<Distribuidora> buscaNome(String nome) {  
        con = ConnectionFactory.getConnection();
	ResultSet rs = null;
        PreparedStatement stmt = null;
        ArrayList<Distribuidora> distribuidora = new ArrayList<Distribuidora>();
	try {  
            stmt = con.prepareStatement("SELECT * FROM distribuidora where  nome like'"+nome+"%'"); 
	    rs = stmt.executeQuery();
            
            while(rs.next()) {  
                Distribuidora dist = new Distribuidora();
                dist.setId(rs.getInt("id")); 
                dist.setNome(rs.getString("nome")); 
                dist.setEndereco(rs.getString("endereco"));
                dist.setCnpj(rs.getInt("cnpj"));
                distribuidora.add(dist);
	    }   
	} catch (SQLException e) {  
	    imprimeErro("Erro ao buscar produto!", e.getMessage());  
	    return null;  
	}finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return distribuidora;
    }
    
    
    private void imprimeErro(String msg, String msgErro) {  
      JOptionPane.showMessageDialog(null, msg, "Erro crítico", 0);  
      System.err.println(msg);  
      System.out.println(msgErro);  
      System.exit(0);  
   } 
    
}

