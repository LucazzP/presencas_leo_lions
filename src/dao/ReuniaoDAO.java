package dao;

import model.Usuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReuniaoDAO {
    private Conexao conn;
    private String query;
    private PreparedStatement statement;
    private ResultSet resultado;

    public ReuniaoDAO() {
        conn = new Conexao();
    }

//    public void inserirUsuario(Usuario u) {
//        try {
//            query = "INSERT INTO usuario(nome, senha, idade, email) VALUES (" +
//                    "'" + u.getNome() + "'," +
//                    "'" + u.getSenha() + "'," +
//                    +u.getIdade() + "," +
//                    "'" + u.getEmail() + "')";
//
//            statement = conn.getConnection().prepareStatement(query);
//            statement.executeUpdate();
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//    }
//
//    public ArrayList<Usuario> listarUsuario() {
//        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
//
//        try {
//            query = "SELECT * FROM usuario";
//            statement = conn.getConnection().prepareStatement(query);
//            resultado = statement.executeQuery();
//
//            while (resultado.next()) {
//                Usuario usuario = new Usuario(resultado.getInt("id"), resultado.getString("nome"),
//                        resultado.getString("senha"), resultado.getInt("idade"), resultado.getString("email")
//                );
//                usuarios.add(usuario);
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//
//        return usuarios;
//    }
//
//    public void editarUsuario(Usuario usuario) {
//        try {
//            query = "UPDATE usuario SET " +
//                    "nome = '" + usuario.getNome() + "'," +
//                    //"senha = '" + usuario.getSenha() + "'," +
//                    //"idade = '" + usuario.getIdade() + "'," +
//                    "email = '" + usuario.getEmail() + "'" +
//                    "WHERE id = '" + usuario.getId() + "';";
//
//            statement = conn.getConnection().prepareStatement(query);
//            statement.executeUpdate();
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//    }
//
//    public void deletarUsuario(int id) {
//        try {
//            query = "DELETE FROM usuario WHERE id = '" + id + "';";
//
//            statement = conn.getConnection().prepareStatement(query);
//            statement.executeUpdate();
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//    }
}
