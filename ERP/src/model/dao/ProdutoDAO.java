package model.dao;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bean.Produto;

public class ProdutoDAO {
    public void create(Produto produto){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            //Inserindo conteúdo no BD
            stmt = con.prepareStatement("INSERT INTO produtos"
                    + "(Nome, Quantidade, ValorUnitario) VALUES (?,?,?)");
            stmt.setString(1, produto.getNome());
            stmt.setInt(2, produto.getQuantidade());
            stmt.setFloat(3, produto.getValorUnitario());
            stmt.executeUpdate();
            System.out.println("Foi possível!");
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Não foi possível");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public void update(Produto produto){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            //Atualizando conteúdo no BD
            stmt = con.prepareStatement("Update produtos set Nome = ?, Quantidade = ?, ValorUnitario = ? where ID = ?");
            stmt.setString(1, produto.getNome());
            stmt.setInt(2, produto.getQuantidade());
            stmt.setFloat(3, produto.getValorUnitario());
            stmt.setInt(4, produto.getID());
            stmt.executeUpdate();
            System.out.println("Foi possível!");
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Não foi possível");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Produto> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet res = null;
        List<Produto> produtos = new ArrayList<>();
        try {
            //Efetua a leitura
            stmt = con.prepareStatement("Select * from produtos");
            res = stmt.executeQuery();
            while(res.next()){
                Produto produto = new Produto();
                produto.setID(res.getInt("ID"));
                produto.setNome(res.getString("Nome"));
                produto.setQuantidade(res.getInt("Quantidade"));
                produto.setValorUnitario(res.getFloat("ValorUnitario"));
                produtos.add(produto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, res);
        }
        return produtos;
    }
}

