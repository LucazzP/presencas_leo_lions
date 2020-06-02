package view.usuario;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoginUsuarioView {
    public int digitarIdUsuario() {
        Scanner sc = new Scanner(System.in);
        int id = -1;

        System.out.println("----- Login -----");
        System.out.println("Digite o seu id de usuario:");

        while (id == -1) {
            try {
                id = sc.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("ERRO: Digite um número válido.");
            }
        }
        return id;
    }

    public String digitarSenha() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua senha:");
        return sc.next();
    }


    public void permissaoInsuficiente() {
        System.out.println("É necessário logar com um usuario administrador.");
    }

    public void senhaIncorreta() {
        System.out.println("Senha incorreta");
    }

    public void sucesso(String nome) {
        System.out.println("\nUsuario logado com sucesso!");
        System.out.println("--- Bem vindo(a) " + nome + "! ---\n");
    }
}
