package controller;

import dao.VerificarTables;
import view.MenuView;

public class MenuController {
    MenuView view = new MenuView();
    int option = 0;

    public MenuController(){
        new VerificarTables().verificar();
        while (true){
            option = view.abrirMenu();

            switch (option){
                case 0:
                    return;
                case 1:
                    CadastrarUsuarioController cadastrarUsuarioController = new CadastrarUsuarioController();
                    break;
                case 2:
                    ListarUsuariosController listarUsuariosController = new ListarUsuariosController();
                    break;
                case 3:
                    EditarUsuarioController editarUsuarioController = new EditarUsuarioController();
                    break;
                case 4:
                    ExcluirUsuarioController excluirUsuarioController = new ExcluirUsuarioController();
                    break;
                default:
                    view.opcaoInvalida();
                    break;
            }

            option = 0;
        }
    }
}
