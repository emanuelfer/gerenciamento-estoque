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

/**
 *
 * @author emanu_cb41ket
 */
public class DaoCategoria {
    private Connection con;  
    
    public Categoria busca(int id) {  
        con = ConnectionFactory.getConnection();
	ResultSet rs = null;
        PreparedStatement stmt = null;
        Categoria cat = new Categoria();
	try {  
            stmt = con.prepareStatement("SELECT * FROM categoria WHERE id = ?");  
            stmt.setInt(1, id);
	    rs = stmt.executeQuery();
            
            while(rs.next()) { 
                cat.setId(rs.getInt("id"));
                cat.setNome(rs.getString("nome"));
                cat.setDescricao(rs.getString("descricao"));
                 
	    }   
	} catch (SQLException e) {  
	    imprimeErro("Erro ao buscar categoria!", e.getMessage());  
	    return null;  
	}finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return cat;
    }  
    
    public void create(Categoria categoria){   
       con = ConnectionFactory.getConnection();
      PreparedStatement stmt = null;
      
      try {  
         stmt = con.prepareStatement("INSERT INTO categoria (nome, descricao) VALUES(?, ?)");  
         stmt.setString(1, categoria.getNome());
         stmt.setString(2, categoria.getDescricao());
         stmt.executeUpdate();
         System.out.println("Categoria Inserida!");  
      } catch (SQLException e) {  
         imprimeErro("Erro ao inserir categoria!", e.getMessage());  
      } finally {  
         ConnectionFactory.closeConnection(con, stmt);  
      }  
    } 
    
    public void update(Categoria categoria) {
        con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE categoria SET nome = ?, descricao = ? WHERE id = ?");
            stmt.setString(1, categoria.getNome());
            stmt.setString(2, categoria.getDescricao());
            stmt.setInt(3, categoria.getId());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void delete(Categoria categoria) {
        con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM categoria WHERE id = ?");
            stmt.setInt(1, categoria.getId());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
    public ArrayList<Categoria> mostrarCategorias(){
       con = ConnectionFactory.getConnection();
	  ResultSet rs = null;
          PreparedStatement stmt = null;
          ArrayList<Categoria> categoria = new ArrayList();
	try {  
            stmt = con.prepareStatement("SELECT * FROM categoria");  
            
	    rs = stmt.executeQuery();
            
            while(rs.next()) { 
                Categoria cat = new Categoria();
                cat.setId(rs.getInt("id"));  
                cat.setNome(rs.getString("nome"));  
                cat.setDescricao(rs.getString("descricao"));
                categoria.add(cat);
	    }   
	} catch (SQLException e) {  
	    imprimeErro("Erro ao buscar pessoa", e.getMessage());  
	    return null;  
	}finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return categoria;
   }
    
    public ArrayList<Categoria> buscaNome(String nome) {  
        con = ConnectionFactory.getConnection();
	  ResultSet rs = null;
          PreparedStatement stmt = null;
          ArrayList<Categoria> categoria = new ArrayList<Categoria>();
	try {  
            stmt = con.prepareStatement("SELECT * FROM categoria where  nome like'"+nome+"%'"); 
	    rs = stmt.executeQuery();
            
            while(rs.next()) { 
                Categoria c = new Categoria();
                c.setId(rs.getInt("id"));  
                c.setNome(rs.getString("nome"));
                c.setDescricao(rs.getString("descricao"));     
                categoria.add(c);
	    }   
	} catch (SQLException e) {  
	    imprimeErro("Erro ao buscar categoria", e.getMessage());  
	    return null;  
	}finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return categoria;
   }
    
    public ArrayList<Categoria> mostraTodos() {  
        con = ConnectionFactory.getConnection();
	  ResultSet rs = null;
          PreparedStatement stmt = null;
          ArrayList<Categoria> categoria = new ArrayList<Categoria>();
	try {  
            stmt = con.prepareStatement("SELECT * FROM categoria"); 
	    rs = stmt.executeQuery();
            
            while(rs.next()) { 
                Categoria c = new Categoria();
                c.setId(rs.getInt("id"));  
                c.setNome(rs.getString("nome"));
                c.setDescricao(rs.getString("descricao"));     
                categoria.add(c);
	    }   
	} catch (SQLException e) {  
	    imprimeErro("Erro ao buscar pessoa", e.getMessage());  
	    return null;  
	}finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return categoria;
   }
    
    private void imprimeErro(String msg, String msgErro) {  
      JOptionPane.showMessageDialog(null, msg, "Erro crítico", 0);  
      System.err.println(msg);  
      System.out.println(msgErro);  
      System.exit(0);  
   }
}
