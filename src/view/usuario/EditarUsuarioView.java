package view.usuario;

import model.Usuario;

import java.util.Scanner;

public class EditarUsuarioView {
    public Usuario editar(Usuario usuario){
        Scanner s = new Scanner(System.in);
        String nome = usuario.getNome();
        String email = usuario.getEmail();
        String senha = "";
        Integer idade = usuario.getIdade();

        System.out.print("Digite o novo nome do " + nome + ": (" + nome + ") ");
        nome = s.nextLine();
        if(nome.isEmpty()){
            nome = usuario.getNome();
        }

        System.out.print("Digite o novo e-mail do(a) " + nome + ": (" + email + ") ");
        email = s.nextLine();
        if(email == null){
            email = usuario.getEmail();
        }

        System.out.print("Digite a nova senha do(a) " + nome + ": (@bC123) ");
        senha = s.nextLine();
        if(senha.isEmpty()) {
            senha = "@bC123";
        }

        System.out.print("Digite a nova idade do(a) " + nome + ": (" + idade + ") ");
        try{
            idade = Integer.parseInt(s.nextLine());
        } catch (NumberFormatException e) {}
        if(idade == null){
            idade = usuario.getIdade();
        }

        return new Usuario(usuario.getId(), nome, senha, idade, email, usuario.getPermissao(), usuario.getSalt());
    }

    public int digitarId(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 0 para cancelar a opção de edição.");
        System.out.println("Digite o ID do registro que deseja modificar.");
        System.out.print("Id: ");

        return sc.nextInt();
    }
}
