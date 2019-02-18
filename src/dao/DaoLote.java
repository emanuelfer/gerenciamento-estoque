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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Categoria;
import model.Lote;
import model.Produto;

/**
 *
 * @author 201612030165
 */
public class DaoLote {
    
    private Connection con;  
    
    public Lote busca(int id){  
        con = ConnectionFactory.getConnection();
	  ResultSet rs = null;
          PreparedStatement stmt = null;
          Lote lote = null;
	try {  
            stmt = con.prepareStatement("SELECT * FROM lote WHERE id = ?");  
            stmt.setInt(1, id);
	    rs = stmt.executeQuery();
            DaoProduto produto = new DaoProduto();
            DaoGerente gerente = new DaoGerente();
            DaoFornecedora fornecedora = new DaoFornecedora();
            while(rs.next()) { 
                lote = new Lote();
                lote.setId(rs.getInt("id")); 
                lote.setGerente(gerente.busca(rs.getInt("idGerente")));
                lote.setFornecedora(fornecedora.busca(rs.getInt("idFornecedora")));
                lote.setProduto(produto.busca(rs.getInt("idProduto")));
                lote.setQtdProduto(rs.getInt("qtdProduto"));
                lote.setValidade(rs.getString("validade"));
                lote.setDataDeEntrada(rs.getString("dataDeEntrada"));  
                if(rs.getString("disponivel").equals("SIM"))
                    lote.setDisponivel(true);
                else
                    lote.setDisponivel(false);
	    }   
	} catch (SQLException e) {  
	    imprimeErro("Erro ao buscar lote!", e.getMessage());  
	    return null;  
	}finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lote;
    }  
    
    public void create(Lote lote){   
       con = ConnectionFactory.getConnection();
      PreparedStatement stmt = null;
      
      try {  
         stmt = con.prepareStatement("INSERT INTO lote (idGerente, idFornecedora, idProduto, qtdProduto, validade, dataDeEntrada, disponivel) VALUES(?,?,?,?,?,?, ?)");  
         stmt.setInt(1, lote.getGerente().getId());
         stmt.setInt(2, lote.getFornecedora().getId());
         stmt.setInt(3, lote.getProduto().getId());
         stmt.setInt(4, lote.getQtdProduto());
         stmt.setString(5, lote.getValidade());
         stmt.setString(6, lote.getDataDeEntrada());
         stmt.setString(7, "SIM");
         stmt.executeUpdate();
         JOptionPane.showMessageDialog(null, "Lote inserido!");
      } catch (SQLException e) {  
         imprimeErro("Erro ao inserir Lote!", e.getMessage());  
      } finally {  
         ConnectionFactory.closeConnection(con, stmt);  
      }  
    } 
    
    public void update(Lote lote) {
        con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE lote SET idGerente = ? ,idFornecedora = ?,idProduto = ?, qtdProduto = ?, validade = ?,dataDeEntrada = ?, disponivel = ? WHERE id = ?");
            stmt.setInt(1, lote.getGerente().getId());
            stmt.setInt(2, lote.getFornecedora().getId());
            stmt.setInt(3, lote.getProduto().getId());
            stmt.setInt(4, lote.getQtdProduto());
            stmt.setString(5, lote.getValidade());
            stmt.setString(6, lote.getDataDeEntrada());
            stmt.setString(7, lote.isDisponivel());
            stmt.setInt(8, lote.getId());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void delete(Lote lote) {
        con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM lote WHERE id = ?");
            stmt.setInt(1, lote.getId());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
    public ArrayList<Lote> mostraLotes(){
       con = ConnectionFactory.getConnection();
	  ResultSet rs = null;
          PreparedStatement stmt = null;
          ArrayList<Lote> lotes = new ArrayList();
	try {  
            stmt = con.prepareStatement("SELECT * FROM lote");  
	    rs = stmt.executeQuery();
            
            DaoProduto produto = new DaoProduto();
            DaoGerente gerente = new DaoGerente();
            DaoFornecedora fornecedora = new DaoFornecedora();
            while(rs.next()) { 
                Lote lote = new Lote();
                lote.setId(rs.getInt("id")); 
                lote.setGerente(gerente.busca(rs.getInt("idGerente")));
                lote.setFornecedora(fornecedora.busca(rs.getInt("idFornecedora")));
                lote.setProduto(produto.busca(rs.getInt("idProduto")));
                lote.setQtdProduto(rs.getInt("qtdProduto"));
                lote.setValidade(rs.getString("validade"));
                lote.setDataDeEntrada(rs.getString("dataDeEntrada"));
                if(rs.getString("disponivel").equals("SIM"))
                    lote.setDisponivel(true);
                else
                    lote.setDisponivel(false);
                lotes.add(lote);
	    }   
	} catch (SQLException e) {  
	    imprimeErro("Erro ao buscar pessoa", e.getMessage());  
	    return null;  
	}finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lotes;
   }
    
    public ArrayList<Lote> buscaNome(String nome){  
        con = ConnectionFactory.getConnection();
	ResultSet rs = null;
        PreparedStatement stmt = null;
        ArrayList<Lote> lotes = new ArrayList<Lote>();
	try {  
            stmt = con.prepareStatement("SELECT * FROM lote where  nome like'"+nome+"%'"); 
	    rs = stmt.executeQuery();
            
            DaoProduto produto = new DaoProduto();
            DaoGerente gerente = new DaoGerente();
            DaoFornecedora fornecedora = new DaoFornecedora();
            while(rs.next()) { 
                Lote lote = new Lote();
                lote.setId(rs.getInt("id")); 
                lote.setGerente(gerente.busca(rs.getInt("idGerente")));
                lote.setFornecedora(fornecedora.busca(rs.getInt("idFornecedora")));
                lote.setProduto(produto.busca(rs.getInt("idProduto")));
                lote.setQtdProduto(rs.getInt("qtdProduto"));
                lote.setValidade(rs.getString("validade"));
                lote.setDataDeEntrada(rs.getString("dataDeEntrada"));  
                if(rs.getString("disponivel").equals("SIM"))
                    lote.setDisponivel(true);
                else
                    lote.setDisponivel(false);
                lotes.add(lote);
	    }   
	} catch (SQLException e) {  
	    imprimeErro("Erro ao buscar produto!", e.getMessage());  
	    return null;  
	}finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lotes;
    }
    
    public int calcularQuantidade(int id) {
        con = ConnectionFactory.getConnection();
	ResultSet rs = null;
        PreparedStatement stmt = null;
        int quantidade =0;
        
        try{
        stmt = con.prepareStatement("SELECT * FROM lote where idProduto = ? && disponivel = 'SIM'"); 
        stmt.setInt(1, id);
	rs = stmt.executeQuery();
        
        while(rs.next()){
            quantidade += rs.getInt("qtdProduto");
        }
        }catch(SQLException e){
            imprimeErro("Erro ao buscar produto!", e.getMessage());  
	    
        }
        return quantidade;
    }
    
    
    private void imprimeErro(String msg, String msgErro) {  
      JOptionPane.showMessageDialog(null, msg, "Erro crítico", 0);  
      System.err.println(msg);  
      System.out.println(msgErro);  
      System.exit(0);  
   } 
    
}

