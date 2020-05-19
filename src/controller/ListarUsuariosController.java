package controller;

import dao.UsuarioDAO;
import view.ListarUsuariosView;

public class ListarUsuariosController {
    public ListarUsuariosController(){
        UsuarioDAO dao = new UsuarioDAO();

        ListarUsuariosView view = new ListarUsuariosView();
        view.listarUsuarios(dao.listarUsuario());
    }
}
