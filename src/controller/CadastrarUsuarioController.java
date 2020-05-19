
package controller;

import dao.UsuarioDAO;

public class CadastrarUsuarioController {
    
    private view.CadastrarUsuarioView cadastrarUsuarioView;
    private model.Usuario u;
    
    public CadastrarUsuarioController(){
        inicializar(false);
    }

    public CadastrarUsuarioController(boolean administrador){
        inicializar(administrador);
    }

    private void inicializar(boolean administrador) {
        cadastrarUsuarioView = new view.CadastrarUsuarioView();
        u = cadastrarUsuarioView.telaDeCadastro(administrador);

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.inserirUsuario(u);
    }
}
