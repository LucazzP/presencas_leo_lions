
package view.presenca;

import model.Presenca;
import model.Reuniao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CadastrarPresencaView {
    
    public Presenca telaDeCadastro(){

        Scanner s = new Scanner(System.in);
        int idReuniao = 0;
        int idUsuario = 0;

        System.out.print("Cadastrando presença: ");

        while (idReuniao == 0) {
            System.out.print("Digite o id da Reunião: ");
            try{
                idReuniao = Integer.parseInt(s.nextLine());
            } catch (NumberFormatException e) {}
        }

        while (idUsuario == 0) {
            System.out.print("Digite o id do Usuario: ");
            try{
                idUsuario = Integer.parseInt(s.nextLine());
            } catch (NumberFormatException e) {}
        }

        return new Presenca(idReuniao, idUsuario);
    }
}
