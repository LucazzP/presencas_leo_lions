package controller.usuario;

import dao.UsuarioDAO;
import view.usuario.ExcluirUsuarioView;

public class ExcluirUsuarioController {
    public ExcluirUsuarioController(){
        ExcluirUsuarioView view = new ExcluirUsuarioView();
        int idUser = view.digitarId();
        if(idUser > 0){
            UsuarioDAO dao = new UsuarioDAO();
            dao.deletarUsuario(idUser);
            view.sucesso(idUser);
        }
    }
}
