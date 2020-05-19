package controller;

import dao.UsuarioDAO;
import model.Usuario;
import view.EditarUsuarioView;

public class EditarUsuarioController {
    public EditarUsuarioController(){
        view.EditarUsuarioView view = new view.EditarUsuarioView();
        int idUser = view.digitarId();
        if(idUser > 0){
            UsuarioDAO dao = new UsuarioDAO();
            Usuario usuario = dao.getUsuario(idUser);
            if(usuario == null) {
                System.out.println("Id de usuario inválido");
                return;
            }
            Usuario newUsuario = view.editar(usuario);
            dao.editarUsuario(newUsuario);
        }
    }
}
