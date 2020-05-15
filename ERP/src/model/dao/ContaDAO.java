package model.dao;

import conexao.ConnectionFactory;
import java.sql.*;
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
}
