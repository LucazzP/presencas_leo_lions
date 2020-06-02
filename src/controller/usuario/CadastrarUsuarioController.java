
package controller.usuario;

import dao.UsuarioDAO;
import view.usuario.CadastrarUsuarioView;

public class CadastrarUsuarioController {
    
    private CadastrarUsuarioView cadastrarUsuarioView;
    private model.Usuario u;
    
    public CadastrarUsuarioController(){
        inicializar(false);
    }

    public CadastrarUsuarioController(boolean administrador){
        inicializar(administrador);
    }

    private void inicializar(boolean administrador) {
        cadastrarUsuarioView = new CadastrarUsuarioView();
        u = cadastrarUsuarioView.telaDeCadastro(administrador);

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.inserirUsuario(u);
        cadastrarUsuarioView.sucesso();
    }
}
