
package controller.reuniao;

import dao.ReuniaoDAO;
import dao.UsuarioDAO;
import view.reuniao.CadastrarReuniaoView;
import view.usuario.CadastrarUsuarioView;

public class CadastrarReuniaoController {
    
    private CadastrarReuniaoView cadastrarReuniaoView;
    private model.Reuniao reuniao;

    public CadastrarReuniaoController(){
        inicializar();
    }

    private void inicializar() {
        cadastrarReuniaoView = new CadastrarReuniaoView();
        reuniao = cadastrarReuniaoView.telaDeCadastro();

        ReuniaoDAO reuniaoDAO = new ReuniaoDAO();
        reuniaoDAO.inserirReuniao(reuniao);
        cadastrarReuniaoView.sucesso();
    }
}
