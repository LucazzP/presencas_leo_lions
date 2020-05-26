package view.presenca;

import model.Reuniao;
import model.Usuario;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class ListarPresencaView {
    public void listar(ArrayList<Usuario> usuarios, Reuniao reuniao) {
        int numero = reuniao.getNumero() == -1 ? reuniao.getId() : reuniao.getNumero();
        System.out.println("\n> Reunião número " + numero + ":\nPresentes: ");

        System.out.println("Id | Nome");

        usuarios.forEach((usuario -> {
            System.out.print(" " + usuario.getId() + " | ");
            System.out.print(usuario.getNome());
        }));

        System.out.println("");
    }
}
