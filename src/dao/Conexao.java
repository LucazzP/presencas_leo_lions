
package dao;

import java.sql.*;


public class Conexao {
    
    private Connection conn;

    public Conexao(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String bancoDb = "jdbc:mysql://127.0.0.1:3306/db_bsi?useSSL=false";
            String banco = "jdbc:mysql://127.0.0.1:3306/?useSSL=false";
            try{
                conn = DriverManager.getConnection(bancoDb, "root", "root");
            } catch (SQLException ex) {
                conn = DriverManager.getConnection(banco, "root", "root");
                executeQuery("CREATE SCHEMA db_bsi");
                conn = DriverManager.getConnection(bancoDb, "root", "root");
            }
        }
        catch(ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public Connection getConnection(){
        return conn;
    }

    public void executeQuery(String query) {
        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement(query);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try{
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
