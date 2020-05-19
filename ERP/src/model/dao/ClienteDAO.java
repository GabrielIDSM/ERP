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
import model.bean.Cliente;

public class ClienteDAO {
    public void create(Cliente cliente){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            //Inserindo conteúdo no BD
            stmt = con.prepareStatement("INSERT INTO clientes"
                    + "(Cliente, PedidosFeitos, Numero, Rua, CEP, Complemento) VALUES (?,?,?,?,?,?)");
            stmt.setString(1, cliente.getCliente());
            stmt.setInt(2, cliente.getPedidosFeitos());
            stmt.setString(3, cliente.getNumero());
            stmt.setString(4, cliente.getRua());
            stmt.setString(5, cliente.getCEP());
            stmt.setString(6, cliente.getComplemento());
            stmt.executeUpdate();
            System.out.println("Foi possível!");
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Não foi possível");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Cliente> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet res = null;
        List<Cliente> clientes = new ArrayList<>();
        try {
            //Efetua a leitura
            stmt = con.prepareStatement("Select * from clientes");
            res = stmt.executeQuery();
            while(res.next()){
                Cliente cliente = new Cliente();
                cliente.setCliente(res.getString("Cliente"));
                cliente.setPedidosFeitos(res.getInt("PedidosFeitos"));
                cliente.setNumero(res.getString("Numero"));
                cliente.setRua(res.getString("Rua"));
                cliente.setCEP(res.getString("CEP"));
                cliente.setComplemento(res.getString("Complemento"));
                clientes.add(cliente);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, res);
        }
        return clientes;
    }
    
}
