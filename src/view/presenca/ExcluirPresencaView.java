package view.presenca;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcluirPresencaView {

    public void sucesso(int idReuniao, int idUsuario){
        System.out.println("Presença com idReuniao " + idReuniao + " e idUsuario " + idUsuario + " excluido com sucesso!");
    }

    public int digitarIdReunião(){
        Scanner sc = new Scanner(System.in);
        int id = -1;

        System.out.println("Digite 0 para cancelar a opção de exclusão.");
        System.out.println("Digite o ID da reunião da presença que deseja excluir.");
        System.out.print("IdReunião: ");

        while (id == -1) {
            try{
                id = sc.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("ERRO: Digite um número válido.");
            }
        }
        return id;
    }

    public int digitarIdUsuario(){
        Scanner sc = new Scanner(System.in);
        int id = -1;

        System.out.println("Digite 0 para cancelar a opção de exclusão.");
        System.out.println("Digite o ID do usuario da presença que deseja EXCLUIR.");
        System.out.print("IdUsuario: ");

        while (id == -1) {
            try{
                id = sc.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("ERRO: Digite um número válido.");
            }
        }
        return id;
    }
}
