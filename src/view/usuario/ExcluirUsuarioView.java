package view.usuario;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcluirUsuarioView {
    public void sucesso(int id){
        System.out.println("Usuario com id " + id + " excluido com sucesso!");
    }
    public int digitarId(){
        Scanner sc = new Scanner(System.in);
        int id = -1;

        System.out.println("Digite 0 para cancelar a opção de exclusão.");
        System.out.println("Digite o ID do registro que deseja EXCLUIR.");
        System.out.print("Id: ");

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
