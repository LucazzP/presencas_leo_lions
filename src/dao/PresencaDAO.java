package dao;


import model.Usuario;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PresencaDAO {
    private Conexao conn;
    private String query;
    private PreparedStatement statement;
    private ResultSet resultado;

    public PresencaDAO() {
        conn = new Conexao();
    }

    public void inserir(int idReuniao, int idUser) {
        try {
            query = "INSERT INTO presenca(reuniao_id, usuario_id) VALUES (" +
                    "" + idReuniao + ","
                    + idUser + ")";

            statement = conn.getConnection().prepareStatement(query);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Usuario> listar(int idReuniao) {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

        try {
            query = "select usuario.id, usuario.nome from presenca inner join usuario on usuario.id = presenca.usuario_id where reuniao_id = " + idReuniao + ";";
            statement = conn.getConnection().prepareStatement(query);
            resultado = statement.executeQuery();

            while (resultado.next()) {
                Usuario usuario = new Usuario(
                    resultado.getInt("id"),
                    resultado.getString("nome")
                );
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return usuarios;
    }

    public void deletar(int idReuniao, int idUser) {
        try {
            query = "DELETE FROM presenca WHERE reuniao_id = '" + idReuniao + "' and " +
                    "usuario_id = '" + idUser + "';";

            statement = conn.getConnection().prepareStatement(query);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
