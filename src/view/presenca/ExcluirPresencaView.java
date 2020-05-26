package view.presenca;

import java.util.Scanner;

public class ExcluirPresencaView {

    public void sucesso(int idReuniao, int idUsuario){
        System.out.println("Presença com idReuniao " + idReuniao + " e idUsuario " + idUsuario + " excluido com sucesso!");
    }

    public int digitarIdReunião(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 0 para cancelar a opção de exclusão.");
        System.out.println("Digite o ID da reunião da presença que deseja EXCLUIR.");
        System.out.print("IdReunião: ");

        return sc.nextInt();
    }

    public int digitarIdUsuario(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 0 para cancelar a opção de exclusão.");
        System.out.println("Digite o ID do usuario da presença que deseja EXCLUIR.");
        System.out.print("IdUsuario: ");

        return sc.nextInt();
    }
}
