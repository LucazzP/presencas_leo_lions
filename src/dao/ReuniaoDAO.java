package dao;

import model.Reuniao;

import java.sql.Date;
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

    public void inserirReuniao(Reuniao reuniao) {
        try {
            query = "INSERT INTO reuniao(data, numero) VALUES (" +
                    "'" + new Date(reuniao.getData().getTime()) + "',"
                    + reuniao.getNumero() + ")";

            statement = conn.getConnection().prepareStatement(query);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Reuniao> listarReuniao() {
        ArrayList<Reuniao> reunioes = new ArrayList<Reuniao>();

        try {
            query = "SELECT * FROM reuniao";
            statement = conn.getConnection().prepareStatement(query);
            resultado = statement.executeQuery();

            while (resultado.next()) {
                Reuniao reuniao = new Reuniao(
                        resultado.getInt("id"),
                        resultado.getDate("data"),
                        resultado.getInt("numero")
                );
                reunioes.add(reuniao);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return reunioes;
    }

    public void editarReuniao(Reuniao reuniao) {
        try {
            query = "UPDATE reuniao SET " +
                    "data = '" + new Date(reuniao.getData().getTime()) + "'," +
                    "numero = '" + reuniao.getNumero() + "'" +
                    "WHERE id = '" + reuniao.getId() + "';";

            statement = conn.getConnection().prepareStatement(query);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void deletarReuniao(int id) {
        try {
            query = "DELETE FROM reuniao WHERE id = '" + id + "';";

            statement = conn.getConnection().prepareStatement(query);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Reuniao getReuniao(int id) {
        Reuniao reuniao = null;
        try {
            query = "SELECT * FROM reuniao WHERE id = " + id + ";";

            statement = conn.getConnection().prepareStatement(query);
            resultado = statement.executeQuery();
            if (resultado.next()) {
                reuniao = new Reuniao(
                        resultado.getInt("id"),
                        resultado.getDate("data"),
                        resultado.getInt("numero")
                );
                return reuniao;
            }
        } catch (SQLException ex) {
            System.out.println("Id da reunião inválida");
        }
        return reuniao;
    }
}
