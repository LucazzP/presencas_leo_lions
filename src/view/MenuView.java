package view;

import java.util.Scanner;

public class MenuView {
    Scanner sc;

    public int abrirMenu() {
        sc = new Scanner(System.in);
        System.out.println("(1) - Registrar presenças");
        System.out.println("(2) - Criar reuniões");
        System.out.println("(3) - Alterar/Adicionar usuarios");
        System.out.println("(0) - Sair");
        System.out.print("Digite uma opção: ");
        return sc.nextInt();
    }

    public int menuPresencas() {
        sc = new Scanner(System.in);
        System.out.println("(1) - Registrar presença");
        System.out.println("(2) - Listar presenças");
        System.out.println("(3) - Excluir presença");
        System.out.println("(0) - Sair");
        System.out.print("Digite uma opção: ");
        return sc.nextInt();
    }

    public int menuReunioes() {
        sc = new Scanner(System.in);
        System.out.println("(1) - Criar reunião");
        System.out.println("(2) - Listar reuniões");
        System.out.println("(3) - Editar reunião");
        System.out.println("(4) - Excluir/Cancelar reunião");
        System.out.println("(0) - Sair");
        System.out.print("Digite uma opção: ");
        return sc.nextInt();
    }

    public int menuUsuario() {
        sc = new Scanner(System.in);
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
