package conexao;

import java.sql.*;

public class ConnectionFactory {
    //Atributos
    final private String DRIVER = "com.mysql.jdbc.Driver";
    final private String URL = "jdbc:mysql://localhost:3306/ERP";
    final private String USER = "root";
    final private String PASS = "";
    //Getters
    public String getDRIVE() {
        return DRIVER;
    }
    public String getURL() {
        return URL;
    }
    public String getUSER() {
        return USER;
    }
    public String getPASS() {
        return PASS;
    }
    public Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro: ",ex);
        }
    }
    //Métodos
    public static void closeConnection(Connection con){
        if (con != null)
            try {
                con.close();
            } catch (SQLException ex) {
                throw new RuntimeException("Erro: ",ex);
            }
    }
    public static void closeConnection(Connection con, PreparedStatement stat){
        closeConnection(con);
        if(stat != null){
            try {
                stat.close();
            } catch (SQLException ex) {
                throw new RuntimeException("Erro: ",ex);
            }
        }
    }
    public static void closeConnection(Connection con, PreparedStatement stat, ResultSet res){
        closeConnection(con, stat);
        if(res != null){
            try {
                res.close();
            } catch (SQLException ex) {
                throw new RuntimeException("Erro: ",ex);
            }
        }
    }
}