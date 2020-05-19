
package dao;

import model.Usuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioDAO {

    private Conexao conn;
    private String query;
    private PreparedStatement statement;
    private ResultSet resultado;

    public UsuarioDAO() {
        conn = new Conexao();
    }

    public void inserirUsuario(Usuario u) {
        try {
            query = "INSERT INTO usuario(nome, senha, idade, permissao, salt, email) VALUES (" +
                    "'" + u.getNome() + "'," +
                    "'" + u.getSenha() + "'," +
                    u.getIdade() + "," +
                    u.getPermissao() + "," +
                    "'" + u.getSalt() + "'," +
                    "'" + u.getEmail() + "')";

            statement = conn.getConnection().prepareStatement(query);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Usuario> listarUsuario() {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

        try {
            query = "SELECT * FROM usuario";
            statement = conn.getConnection().prepareStatement(query);
            resultado = statement.executeQuery();

            while (resultado.next()) {
                Usuario usuario = new Usuario(resultado.getInt("id"), resultado.getString("nome"),
                        resultado.getString("senha"), resultado.getInt("idade"),
                        resultado.getString("email"), resultado.getInt("permissao"), resultado.getString("salt")
                );
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return usuarios;
    }

    public void editarUsuario(Usuario usuario) {
        try {
            query = "UPDATE usuario SET " +
                    "nome = '" + usuario.getNome() + "'," +
                    "senha = '" + usuario.getSenha() + "'," +
                    "idade = '" + usuario.getIdade() + "'," +
                    "email = '" + usuario.getEmail() + "'" +
                    "permissao = '" + usuario.getPermissao() + "'" +
                    "WHERE id = '" + usuario.getId() + "';";

            statement = conn.getConnection().prepareStatement(query);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void deletarUsuario(int id) {
        try {
            query = "DELETE FROM usuario WHERE id = " + id + ";";

            statement = conn.getConnection().prepareStatement(query);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Usuario getUsuario(int id) {
        Usuario usuario = null;
        try {
            query = "SELECT * FROM usuario WHERE id = " + id + ";";

            statement = conn.getConnection().prepareStatement(query);
            resultado = statement.executeQuery();
            if (resultado.next()) {
                usuario = new Usuario(resultado.getInt("id"), resultado.getString("nome"),
                        null, resultado.getInt("idade"),
                        resultado.getString("email"), resultado.getInt("permissao"), resultado.getString("salt")
                );
                return usuario;
            }
        } catch (SQLException ex) {
            System.out.println("Id de usuario inválido");
        }
        return usuario;
    }
}
