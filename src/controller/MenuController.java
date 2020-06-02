package controller;

import controller.presenca.ExcluirPresencaController;
import controller.presenca.ListarPresencaController;
import controller.presenca.RegistrarPresencaController;
import controller.reuniao.CadastrarReuniaoController;
import controller.reuniao.EditarReuniaoController;
import controller.reuniao.ExcluirReuniaoController;
import controller.reuniao.ListarReunioesController;
import controller.usuario.CadastrarUsuarioController;
import controller.usuario.EditarUsuarioController;
import controller.usuario.ExcluirUsuarioController;
import controller.usuario.ListarUsuariosController;
import dao.VerificarTables;
import view.MenuView;

public class MenuController {
    MenuView view = new MenuView();
    int option = 0;

    public MenuController() {
        abrirMenu();
    }

    public void abrirMenu() {
        while (true) {
            option = view.abrirMenu();

            switch (option) {
                case 0:
                    return;
                case 1:
                    menuPresencas();
                    break;
                case 2:
                    menuReunioes();
                    break;
                case 3:
                    menuUsuario();
                    break;
                default:
                    view.opcaoInvalida();
                    break;
            }

            option = 0;
        }
    }

    public void menuPresencas() {
        while (true) {
            option = view.menuPresencas();

            switch (option) {
                case 0:
                    return;
                case 1:
                    RegistrarPresencaController registrarPresencaController = new RegistrarPresencaController();
                    break;
                case 2:
                    ListarPresencaController listarPresencaController = new ListarPresencaController();
                    break;
                case 3:
                    ExcluirPresencaController excluirPresencaController = new ExcluirPresencaController();
                    break;
                default:
                    view.opcaoInvalida();
                    break;
            }

            option = 0;
        }
    }

    public void menuReunioes() {
        while (true) {
            option = view.menuReunioes();

            switch (option) {
                case 0:
                    return;
                case 1:
                    CadastrarReuniaoController cadastrarReuniaoController = new CadastrarReuniaoController();
                    break;
                case 2:
                    ListarReunioesController listarReunioesController = new ListarReunioesController();
                    break;
                case 3:
                    EditarReuniaoController editarReuniaoController = new EditarReuniaoController();
                    break;
                case 4:
                    ExcluirReuniaoController excluirReuniaoController = new ExcluirReuniaoController();
                    break;
                default:
                    view.opcaoInvalida();
                    break;
            }

            option = 0;
        }
    }

    public void menuUsuario() {
        while (true) {
            option = view.menuUsuario();

            switch (option) {
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
