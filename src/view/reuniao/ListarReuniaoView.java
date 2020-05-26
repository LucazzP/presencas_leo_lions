package view.reuniao;

import model.Reuniao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class ListarReuniaoView {
    public void listar(ArrayList<Reuniao> reunioes) {
        System.out.println("\n> Registros cadastrados:");

        System.out.println("Id | Numero | Data");

        reunioes.forEach((reuniao -> {
            System.out.print(" " + reuniao.getId() + " | ");
            System.out.print(reuniao.getNumero() + " | ");
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println(sdf.format(reuniao.getData()));
        }));

        System.out.println("");
    }
}
