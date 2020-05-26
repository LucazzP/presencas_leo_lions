package controller.usuario;

import dao.UsuarioDAO;
import view.usuario.ListarUsuariosView;

public class ListarUsuariosController {
    public ListarUsuariosController(){
        UsuarioDAO dao = new UsuarioDAO();

        ListarUsuariosView view = new ListarUsuariosView();
        view.listarUsuarios(dao.listarUsuario());
    }
}
