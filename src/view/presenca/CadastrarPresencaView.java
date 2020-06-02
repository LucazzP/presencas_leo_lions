
package view.presenca;

import model.Presenca;
import model.Reuniao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CadastrarPresencaView {

    public Presenca telaDeCadastro(int idReuniao){

        Scanner s = new Scanner(System.in);
        int idUsuario = 0;

        System.out.println("Digite -1 para sair");
        System.out.println("Cadastrando presença reunião id " + idReuniao + ": ");

        while (idUsuario == 0) {
            System.out.print("Digite o id do Usuario: ");
            try{
                idUsuario = Integer.parseInt(s.nextLine());
            } catch (NumberFormatException ignored) {}
        }
        if(idUsuario == -1) return null;
        return new Presenca(idReuniao, idUsuario);
    }
    
    public Presenca telaDeCadastro(){

        Scanner s = new Scanner(System.in);
        int idReuniao = 0;
        int idUsuario = 0;

        System.out.print("Cadastrando presença: ");

        while (idReuniao == 0) {
            System.out.print("Digite o id da Reunião: ");
            try{
                idReuniao = Integer.parseInt(s.nextLine());
            } catch (NumberFormatException ignored) {}
        }

        while (idUsuario == 0) {
            System.out.print("Digite o id do Usuario: ");
            try{
                idUsuario = Integer.parseInt(s.nextLine());
            } catch (NumberFormatException ignored) {}
        }

        return new Presenca(idReuniao, idUsuario);
    }

    public void usuarioJaCadastrado() {
        System.out.println("Usuário já registrado como presente nesta reunião");
    }

    public void entradaInvalida() {
        System.out.println("Usuario ou reunião inválida, digite novamente:");
    }

    public void erroDesconhecido() {
        System.out.println("Erro desconhecido, reporte o erro para o desenvolvedor do sistema:");
    }

    public void sucesso() {
        System.out.println("Presença registrada com sucesso!");
    }
}
