package controller.usuario;

import dao.UsuarioDAO;
import model.Usuario;
import utils.PasswordUtils;
import view.usuario.LoginUsuarioView;

public class LoginUsuarioController {
    public void login() {
        LoginUsuarioView view = new LoginUsuarioView();
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        String senha;

        new ListarUsuariosController();
        int idUsuario = view.digitarIdUsuario();

        while (true) {
            senha = view.digitarSenha();
            Usuario usuario = usuarioDAO.getUsuario(idUsuario);
            if(PasswordUtils.verifyUserPassword(senha, usuario.getSenha(), usuario.getSalt())){
                if(usuario.getPermissao() < 10){
                    view.permissaoInsuficiente();
                } else {
                    view.sucesso(usuario.getNome());
                    return;
                }
            } else {
                view.senhaIncorreta();
            }
        }
    }
}
