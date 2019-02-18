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
import model.Produto;

/**
 *
 * @author 201612030165
 */
public class DaoProduto {
    
    private Connection con;  
    
    public Produto busca(int id) {  
        con = ConnectionFactory.getConnection();
	  ResultSet rs = null;
          PreparedStatement stmt = null;
          Produto prod = null;
	try {  
            stmt = con.prepareStatement("SELECT * FROM produto WHERE id = ?");  
            stmt.setInt(1, id);
	    rs = stmt.executeQuery();
            DaoCategoria categoria = new DaoCategoria();
            while(rs.next()) { 
                prod = new Produto();
                prod.setId(rs.getInt("id")); 
                prod.setMarca(rs.getString("marca"));
                prod.setNome(rs.getString("nome")); 
                prod.setPeso(rs.getDouble("peso"));
                prod.setCaegoria(categoria.busca(rs.getInt("idCategoria")));
                prod.setPreco(rs.getDouble("preco"));  
	    }   
	} catch (SQLException e) {  
	    imprimeErro("Erro ao buscar produto!", e.getMessage());  
	    return null;  
	}finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return prod;
    }  
    
    public void create(Produto produto){   
       con = ConnectionFactory.getConnection();
      PreparedStatement stmt = null;
      
      try {  
         stmt = con.prepareStatement("INSERT INTO produto (idCategoria, marca, peso, nome, preco) VALUES(?,?,?,?,?)");  
         stmt.setInt(1, produto.getCaegoria().getId());
         stmt.setString(2, produto.getMarca());
         stmt.setDouble(3, produto.getPeso());
         stmt.setString(4, produto.getNome());
         stmt.setDouble(5, produto.getPreco());
         stmt.executeUpdate();
         JOptionPane.showMessageDialog(null, "Produto inserido!");
      } catch (SQLException e) {  
         imprimeErro("Erro ao inserir produto!", e.getMessage());  
      } finally {  
         ConnectionFactory.closeConnection(con, stmt);  
      }  
    } 
    
    public void update(Produto produto) {
        con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE produto SET idCategoria = ? ,marca = ?,peso = ?, nome = ?, preco = ? WHERE id = ?");
            stmt.setInt(1, produto.getCaegoria().getId());
            stmt.setString(2, produto.getMarca());
            stmt.setDouble(3, produto.getPeso());
            stmt.setString(4, produto.getCaegoria().getNome());
            stmt.setDouble(5, produto.getPreco());
            stmt.setInt(6, produto.getId());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void delete(Produto produto) {
        con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM produto WHERE id = ?");
            stmt.setInt(1, produto.getId());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
    public ArrayList<Produto> mostraTodos(){
       con = ConnectionFactory.getConnection();
	  ResultSet rs = null;
          PreparedStatement stmt = null;
          ArrayList<Produto> produto = new ArrayList();
	try {  
            stmt = con.prepareStatement("SELECT * FROM produto");  
	    rs = stmt.executeQuery();
            
            DaoCategoria categoria = new DaoCategoria();
            
            while(rs.next()) { 
                Produto prod = new Produto();
                prod = new Produto();
                prod.setId(rs.getInt("id")); 
                prod.setMarca(rs.getString("marca"));
                prod.setNome(rs.getString("nome")); 
                prod.setPeso(rs.getDouble("peso"));
                prod.setCaegoria(categoria.busca(rs.getInt("idCategoria")));
                prod.setPreco(rs.getDouble("preco"));
                produto.add(prod);
	    }   
	} catch (SQLException e) {  
	    imprimeErro("Erro ao buscar pessoa", e.getMessage());  
	    return null;  
	}finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return produto;
   }
    
    public ArrayList<Produto> buscaNome(String nome) {  
        con = ConnectionFactory.getConnection();
	  ResultSet rs = null;
          PreparedStatement stmt = null;
          ArrayList<Produto> produto = new ArrayList<Produto>();
	try {  
            stmt = con.prepareStatement("SELECT * FROM produto where  nome like'"+nome+"%'"); 
	    rs = stmt.executeQuery();
            
            while(rs.next()) { 
                Produto prod = new Produto();  
                DaoCategoria categoria = new DaoCategoria();
                prod = new Produto();
                prod.setId(rs.getInt("id")); 
                prod.setMarca(rs.getString("marca"));
                prod.setNome(rs.getString("nome")); 
                prod.setPeso(rs.getDouble("peso"));
                prod.setCaegoria(categoria.busca(rs.getInt("idCategoria")));
                prod.setPreco(rs.getDouble("preco"));  
                produto.add(prod);
	    }   
	} catch (SQLException e) {  
	    imprimeErro("Erro ao buscar produto!", e.getMessage());  
	    return null;  
	}finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return produto;
    }
    
    
    private void imprimeErro(String msg, String msgErro) {  
      JOptionPane.showMessageDialog(null, msg, "Erro crítico", 0);  
      System.err.println(msg);  
      System.out.println(msgErro);  
      System.exit(0);  
   } 
    
}

