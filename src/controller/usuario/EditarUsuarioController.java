package controller.usuario;

import dao.UsuarioDAO;
import model.Usuario;
import view.usuario.EditarUsuarioView;

public class EditarUsuarioController {
    public EditarUsuarioController(){
        EditarUsuarioView view = new EditarUsuarioView();
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
