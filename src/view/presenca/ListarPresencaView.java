package view.presenca;

import model.Reuniao;
import model.Usuario;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class ListarPresencaView {
    public void listar(ArrayList<Usuario> usuarios, Reuniao reuniao) {
        int numero = reuniao.getNumero() == -1 ? reuniao.getId() : reuniao.getNumero();
        System.out.println("\n> Reunião número " + numero + ":\nPresentes: ");

        System.out.println("Id | Nome");

        usuarios.forEach((usuario -> {
            System.out.print(" " + usuario.getId() + " | ");
            System.out.print(usuario.getNome());
            System.out.println("");
        }));

        System.out.println("");
    }

    public int digitarIdReunião(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 0 para cancelar a opção de selecionar.");
        System.out.println("Digite o ID da reunião da presença que deseja Listar.");
        System.out.print("IdReunião: ");

        return sc.nextInt();
    }
}
