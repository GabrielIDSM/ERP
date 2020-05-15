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
                    + "(Login, Senha) VALUES (?,?)");
            stmt.setString(1, conta.getLogin());
            stmt.setString(2, conta.getSenha());
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
