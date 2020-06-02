
package view.usuario;

import model.Usuario;

import java.util.Scanner;

public class CadastrarUsuarioView {
    
    private Usuario u;
    
    public Usuario telaDeCadastro(boolean administrador){

        Scanner s = new Scanner(System.in);
        String label = ((administrador) ? "administrador" : "integrante");
        String nome = null;
        String email;
        String senha;
        Integer idade = null;

        while (nome == null) {
            System.out.print("Digite o nome do " + label + ": ");
            nome = s.nextLine();
        }
        
        System.out.print("Digite o e-mail do(a) " + nome + ": (nome@email.com) ");
        email = s.nextLine();
        if(email == null){
            email = "";
        }

        System.out.print("Digite a senha do(a) " + nome + ": (@bC123) ");
        senha = s.nextLine();
        if(senha.isEmpty()) {
            senha = "@bC123";
        }

        System.out.print("Digite a idade do(a) " + nome + ": (16) ");
        try{
            idade = Integer.parseInt(s.nextLine());
        } catch (NumberFormatException ignored) {
            idade = 16;
        }

        return new Usuario(nome, senha, idade, email, administrador);
    }

    public void sucesso() {
        System.out.println("Usuario cadastrado com sucesso!");
    }
}
