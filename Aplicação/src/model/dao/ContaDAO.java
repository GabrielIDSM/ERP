package model.dao;

import conexao.ConnectionFactory;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bean.Conta;

public class ContaDAO {
    public void create(Conta conta){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            //Inserindo conteúdo no BD
            stmt = con.prepareStatement("INSERT INTO contas"
                    + "(Login, Senha, Funcao) VALUES (?,?,?)");
            stmt.setString(1, conta.getLogin());
            stmt.setString(2, conta.getSenha());
            stmt.setInt(3, conta.getFuncao());
            stmt.executeUpdate();
            System.out.println("Foi possível!");
        } catch (SQLException ex) {
            Logger.getLogger(ContaDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Não foi possível");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public void update(Conta conta){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            //Atualizando conteúdo no BD
            stmt = con.prepareStatement("Update contas set Senha = ?, Funcao = ? where Login = ?");
            stmt.setString(1, conta.getSenha());
            stmt.setInt(2, conta.getFuncao());
            stmt.setString(3, conta.getLogin());
            stmt.executeUpdate();
            System.out.println("Foi possível!");
        } catch (SQLException ex) {
            Logger.getLogger(ContaDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Não foi possível");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Conta> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet res = null;
        List<Conta> contas = new ArrayList<>();
        try {
            //Efetua a leitura
            stmt = con.prepareStatement("Select * from contas");
            res = stmt.executeQuery();
            while(res.next()){
                Conta conta = new Conta();
                conta.setLogin(res.getString("Login"));
                conta.setSenha(res.getString("Senha"));
                conta.setFuncao(res.getInt("Funcao"));
                contas.add(conta);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ContaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, res);
        }
        return contas;
    }
    
}
