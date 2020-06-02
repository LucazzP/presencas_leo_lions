
package controller.presenca;

import controller.reuniao.ListarReunioesController;
import controller.usuario.ListarUsuariosController;
import dao.PresencaDAO;
import dao.ReuniaoDAO;
import view.presenca.CadastrarPresencaView;
import view.reuniao.CadastrarReuniaoView;

import java.sql.SQLException;

public class RegistrarPresencaController {

    private model.Presenca presenca;

    public RegistrarPresencaController() {
        inicializar();
    }

    private void inicializar() {
        CadastrarPresencaView cadastrarPresencaView = new CadastrarPresencaView();

        ListarReunioesController listarReunioesController = new ListarReunioesController();

        while (true) {
            ListarUsuariosController listarUsuariosController = new ListarUsuariosController();
            if(presenca == null){
                presenca = cadastrarPresencaView.telaDeCadastro();
            } else {
                presenca = cadastrarPresencaView.telaDeCadastro(presenca.getIdReuniao());
                if (presenca == null) return;
            }

            PresencaDAO presencaDAO = new PresencaDAO();
            try {
                presencaDAO.inserir(presenca.getIdReuniao(), presenca.getIdUser());
                cadastrarPresencaView.sucesso();
            } catch (SQLException throwables) {
                switch (throwables.getErrorCode()) {
                    case 1062:
                        cadastrarPresencaView.usuarioJaCadastrado();
                        return;
                    case 1452:
                        cadastrarPresencaView.entradaInvalida();
                        break;
                    default:
                        cadastrarPresencaView.erroDesconhecido();
                        break;
                }
            }
        }
    }
}