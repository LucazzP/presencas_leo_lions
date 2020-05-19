package controller;

import dao.UsuarioDAO;
import view.ExcluirUsuarioView;

public class ExcluirUsuarioController {
    public ExcluirUsuarioController(){
        view.ExcluirUsuarioView view = new view.ExcluirUsuarioView();
        int idUser = view.digitarId();
        if(idUser > 0){
            UsuarioDAO dao = new UsuarioDAO();
            dao.deletarUsuario(idUser);
            view.sucesso(idUser);
        }
    }
}
