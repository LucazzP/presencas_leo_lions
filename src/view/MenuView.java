package view;

import java.util.Scanner;

public class MenuView {
    public int abrirMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("(1) - Cadastrar usuario");
        System.out.println("(2) - Listar usuarios");
        System.out.println("(3) - Editar usuario");
        System.out.println("(4) - Excluir usuario");
        System.out.println("(0) - Sair");
        System.out.print("Digite uma opção: ");
        return sc.nextInt();
    }

    public void opcaoInvalida() {
        System.out.println("#####  Opção invalida  #####");
    }
}
