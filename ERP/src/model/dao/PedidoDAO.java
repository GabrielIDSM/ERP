package model.dao;

import conexao.ConnectionFactory;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bean.Pedido;

public class PedidoDAO {
    public void create(Pedido pedido){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            //Inserindo conteúdo no BD
            stmt = con.prepareStatement("INSERT INTO pedidos"
                    + "(Vendedor, Cliente, DataDeEntrega, Entregador, Valor, Estado) VALUES (?,?,?,?,?,?)");
            stmt.setString(1, pedido.getVendedor());
            stmt.setString(2, pedido.getCliente());
            stmt.setString(3, pedido.getDataDeEntrega());
            stmt.setString(4, pedido.getEntregador());
            stmt.setFloat(5, pedido.getValor());
            stmt.setString(6, pedido.getEstado());
            stmt.executeUpdate();
            System.out.println("Foi possível!");
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Não foi possível");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Pedido> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet res = null;
        List<Pedido> pedidos = new ArrayList<>();
        try {
            //Efetua a leitura
            stmt = con.prepareStatement("Select * from pedidos");
            res = stmt.executeQuery();
            while(res.next()){
                Pedido pedido = new Pedido();
                pedido.setID(res.getInt("ID"));
                pedido.setVendedor(res.getString("Vendedor"));
                pedido.setCliente(res.getString("Cliente"));
                pedido.setDataDeEntrega(res.getString("DataDeEntrega"));
                pedido.setEntregador(res.getString("Entregador"));
                pedido.setValor(res.getFloat("Valor"));
                pedido.setEstado(res.getString("Estado"));
                pedidos.add(pedido);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, res);
        }
        return pedidos;
    }
}
