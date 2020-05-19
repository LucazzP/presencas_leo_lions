package view;

import java.util.Scanner;

public class ExcluirUsuarioView {
    public void sucesso(int id){
        System.out.println("Usuario com id " + id + " excluido com sucesso!");
    }
    public int digitarId(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 0 para cancelar a opção de exclusão.");
        System.out.println("Digite o ID do registro que deseja EXCLUIR.");
        System.out.print("Id: ");

        return sc.nextInt();
    }
}
