package view;

import model.Usuario;

import java.util.ArrayList;

public class ListarUsuariosView {
    public void listarUsuarios(ArrayList<Usuario> usuarios) {
        System.out.println("\n> Registros cadastrados:");

        System.out.println("Id | Nome | Email");

        usuarios.forEach((usuario -> {
            System.out.print(" " + usuario.getId() + " | ");
            System.out.print(usuario.getNome() + " | ");
            System.out.println(usuario.getEmail());
        }));

        System.out.println("");
    }
}
