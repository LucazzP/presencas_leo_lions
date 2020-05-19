
package dao;

import java.sql.*;


public class Conexao {
    
    private Connection conn;
    private String banco = "jdbc:mysql://127.0.0.1:3306/db_bsi?useSSL=false";
    
    public Conexao(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(banco, "root", "root");
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
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
