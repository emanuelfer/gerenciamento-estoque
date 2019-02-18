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
import model.Gerente;
import model.Produto;

/**
 *
 * @author 201612030165
 */
public class DaoGerente {
    
    private Connection con;  
    
    public Gerente busca(int id) {  
        con = ConnectionFactory.getConnection();
	  ResultSet rs = null;
          PreparedStatement stmt = null;
          Gerente gerente = null;
	try {  
            stmt = con.prepareStatement("SELECT * FROM gerente WHERE id = ?");  
            stmt.setInt(1, id);
	    rs = stmt.executeQuery();
            while(rs.next()) { 
                gerente = new Gerente();
                gerente.setId(rs.getInt("id")); 
                gerente.setNome(rs.getString("nome")); 
                gerente.setCpf(rs.getInt("cpf"));
                gerente.setIdade(rs.getInt("idade"));
	    }   
	} catch (SQLException e) {  
	    imprimeErro("Erro ao buscar gerente!", e.getMessage());  
	    return null;  
	}finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return gerente;
    }  
    
    public void create(Gerente gerente){   
       con = ConnectionFactory.getConnection();
      PreparedStatement stmt = null;
      
      try {  
         stmt = con.prepareStatement("INSERT INTO gerente (nome, cpf, idade) VALUES(?,?,?)"); 
         stmt.setString(1, gerente.getNome());
         stmt.setInt(2, gerente.getCpf());
         stmt.setInt(3, gerente.getIdade());
         stmt.executeUpdate();
         System.out.println("Gerente Inserido!");  
      } catch (SQLException e) {  
         imprimeErro("Erro ao inserir Gerente!", e.getMessage());  
      } finally {  
         ConnectionFactory.closeConnection(con, stmt);  
      }  
    } 
    
    public void update(Gerente gerente) {
        con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE gerente SET nome = ? ,cpf = ?,idade = ? WHERE id = ?");
            stmt.setString(1, gerente.getNome());
            stmt.setInt(2, gerente.getCpf());
            stmt.setInt(3, gerente.getIdade());
            stmt.setInt(4, gerente.getId());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void delete(Gerente gerente) {
        con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM gerente WHERE id = ?");
            stmt.setInt(1, gerente.getId());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
    public ArrayList<Gerente> mostraTodos(){
       con = ConnectionFactory.getConnection();
	  ResultSet rs = null;
          PreparedStatement stmt = null;
          ArrayList<Gerente> gerentes = new ArrayList();
	try {  
            stmt = con.prepareStatement("SELECT * FROM gerente");  
	    rs = stmt.executeQuery();
            
            while(rs.next()) { 
                Gerente gerente = new Gerente();
                gerente.setId(rs.getInt("id")); 
                gerente.setNome(rs.getString("nome")); 
                gerente.setCpf(rs.getInt("cpf"));
                gerente.setIdade(rs.getInt("idade"));
                gerentes.add(gerente);
	    }   
	} catch (SQLException e) {  
	    imprimeErro("Erro ao buscar pessoa", e.getMessage());  
	    return null;  
	}finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return gerentes;
   }
    
    public ArrayList<Gerente> buscaNome(String nome) {  
        con = ConnectionFactory.getConnection();
	ResultSet rs = null;
        PreparedStatement stmt = null;
        ArrayList<Gerente> gerentes = new ArrayList<Gerente>();
	try {  
            stmt = con.prepareStatement("SELECT * FROM gerente where  nome like'"+nome+"%'"); 
	    rs = stmt.executeQuery();
            
            while(rs.next()) {  
                Gerente gerente = new Gerente();
                gerente.setId(rs.getInt("id")); 
                gerente.setNome(rs.getString("nome")); 
                gerente.setCpf(rs.getInt("cpf"));
                gerente.setIdade(rs.getInt("idade"));
                gerentes.add(gerente);
	    }   
	} catch (SQLException e) {  
	    imprimeErro("Erro ao buscar Gerente!", e.getMessage());  
	    return null;  
	}finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return gerentes;
    }
    
    public Gerente autenticar(int cpf, String senha){
        con = ConnectionFactory.getConnection();
	ResultSet rs = null;
        PreparedStatement stmt = null;
        Gerente gerente = null;
        
        try{
            stmt = con.prepareStatement("SELECT * FROM gerente where cpf = ? && senha = ?");
            stmt.setInt(1, cpf);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                gerente = new Gerente();
                gerente.setId(rs.getInt("id"));
                gerente.setCpf(rs.getInt("cpf"));
                gerente.setNome(rs.getString("nome"));
                gerente.setIdade(rs.getInt("idade"));
                gerente.setSenha(rs.getString("senha"));
            }
            
        }catch(SQLException e){
            imprimeErro("Erro ao buscar Gerente!", e.getMessage());  
	    
        }
        return gerente;
    }
    
    private void imprimeErro(String msg, String msgErro) {  
      JOptionPane.showMessageDialog(null, msg, "Erro crítico", 0);  
      System.err.println(msg);  
      System.out.println(msgErro);  
      System.exit(0);  
   } 
    
}

