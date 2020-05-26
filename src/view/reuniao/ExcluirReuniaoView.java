package view.reuniao;

import java.util.Scanner;

public class ExcluirReuniaoView {
    public void sucesso(int id){
        System.out.println("Reunião com id " + id + " excluido com sucesso!");
    }
    public int digitarId(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 0 para cancelar a opção de exclusão.");
        System.out.println("Digite o ID da reunião que deseja EXCLUIR e CANCELAR.");
        System.out.print("Id: ");

        return sc.nextInt();
    }
}
