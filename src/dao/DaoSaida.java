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
import model.Lote;
import model.Produto;
import model.Saida;

/**
 *
 * @author 201612030165
 */
public class DaoSaida {
    
    private Connection con;  
    
    public Saida busca(int id) {  
        con = ConnectionFactory.getConnection();
	  ResultSet rs = null;
          PreparedStatement stmt = null;
          Saida saida = null;
	try {  
            stmt = con.prepareStatement("SELECT * FROM saida WHERE id = ?");  
            stmt.setInt(1, id);
	    rs = stmt.executeQuery();
            DaoGerente gerente = new DaoGerente();
            DaoDistribuidora distribuidora = new DaoDistribuidora();
            DaoLote lote = new DaoLote();
            while(rs.next()) { 
                saida = new Saida();
                saida.setId(rs.getInt("id"));
                saida.setGerente(gerente.busca(rs.getInt("idGerente")));
                saida.setDistribuidora(distribuidora.busca(rs.getInt("idDistribuidora")));
                saida.setLote(lote.busca(rs.getInt("idLote")));
                saida.setDataDeSaida(rs.getString("dataDeSaida"));
	    }   
	} catch (SQLException e) {  
	    imprimeErro("Erro ao buscar saída!", e.getMessage());  
	    return null;  
	}finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return saida;
    }  
    
    public void create(Saida saida){   
       con = ConnectionFactory.getConnection();
      PreparedStatement stmt = null;
      
      try {  
         stmt = con.prepareStatement("INSERT INTO saida (idLote, idDistribuidora, idGerente, dataDeSaida) VALUES(?,?,?,?)");  
         stmt.setInt(1, saida.getLote().getId());
         stmt.setInt(2, saida.getDistribuidora().getId());
         stmt.setInt(3, saida.getGerente().getId());
         stmt.setString(4, saida.getDataDeSaida());
         stmt.executeUpdate();
         JOptionPane.showMessageDialog(null, "Saída registrada!");
      } catch (SQLException e) {  
         imprimeErro("Erro ao registrar saída!", e.getMessage());  
      } finally {  
         ConnectionFactory.closeConnection(con, stmt);  
      }  
    } 
    
    public void update(Saida saida) {
        con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE saida SET idLote = ?, idDistribuidora = ?, idGerente = ?, dataDeSaida = ? WHERE id = ?");
            stmt.setInt(1, saida.getLote().getId());
            stmt.setInt(2, saida.getDistribuidora().getId());
            stmt.setInt(3, saida.getGerente().getId());
            stmt.setString(4, saida.getDataDeSaida());
            stmt.setInt(5, saida.getId());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void delete(Saida saida) {
        con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM saida WHERE id = ?");
            stmt.setInt(1, saida.getId());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
    public ArrayList<Saida> mostraSaidas(){
       con = ConnectionFactory.getConnection();
	  ResultSet rs = null;
          PreparedStatement stmt = null;
          ArrayList<Saida> saidas = new ArrayList();
	try {  
            stmt = con.prepareStatement("SELECT * FROM saida");  
	    rs = stmt.executeQuery();
            
            DaoGerente gerente = new DaoGerente();
            DaoDistribuidora distribuidora = new DaoDistribuidora();
            DaoLote lote = new DaoLote();
            while(rs.next()) { 
                Saida saida = new Saida();
                saida.setId(rs.getInt("id"));
                saida.setGerente(gerente.busca(rs.getInt("idGerente")));
                saida.setDistribuidora(distribuidora.busca(rs.getInt("idDistribuidora")));
                saida.setDataDeSaida(rs.getString("dataDeSaida"));
                saida.setLote(lote.busca(rs.getInt("idLote")));
                saidas.add(saida);
	    }   
	} catch (SQLException e) {  
	    imprimeErro("Erro ao buscar saída", e.getMessage());  
	    return null;  
	}finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return saidas;
   }
    
    public ArrayList<Saida> buscaNome(String nome) {  
        con = ConnectionFactory.getConnection();
	  ResultSet rs = null;
          PreparedStatement stmt = null;
          ArrayList<Saida> saidas = new ArrayList<Saida>();
	try {  
            stmt = con.prepareStatement("SELECT * FROM saida where  nome like'"+nome+"%'"); 
	    rs = stmt.executeQuery();
            
            DaoGerente gerente = new DaoGerente();
            DaoDistribuidora distribuidora = new DaoDistribuidora();
            while(rs.next()) { 
                Saida saida = new Saida();
                saida.setId(rs.getInt("id"));
                saida.setGerente(gerente.busca(rs.getInt("idGerente")));
                saida.setDistribuidora(distribuidora.busca(rs.getInt("idDistribuidora")));
                saida.setDataDeSaida(rs.getString("dataDeSaida"));
                saidas.add(saida);
	    }   
	} catch (SQLException e) {  
	    imprimeErro("Erro ao buscar produto!", e.getMessage());  
	    return null;  
	}finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return saidas;
    }
    
    
    private void imprimeErro(String msg, String msgErro) {  
      JOptionPane.showMessageDialog(null, msg, "Erro crítico", 0);  
      System.err.println(msg);  
      System.out.println(msgErro);  
      System.exit(0);  
   } 
    
}

