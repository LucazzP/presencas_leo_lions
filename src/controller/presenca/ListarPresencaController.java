package controller.presenca;


import controller.reuniao.ListarReunioesController;
import dao.PresencaDAO;
import dao.ReuniaoDAO;
import view.presenca.ListarPresencaView;
import view.reuniao.ListarReuniaoView;

public class ListarPresencaController {
    public ListarPresencaController(){
        PresencaDAO daoPresenca = new PresencaDAO();
        ReuniaoDAO daoReuniao = new ReuniaoDAO();

        ListarPresencaView view = new ListarPresencaView();
        ListarReunioesController listarReunioesController = new ListarReunioesController();
        int reuniaoId = view.digitarIdReunião();
        view.listar(daoPresenca.listar(reuniaoId), daoReuniao.getReuniao(reuniaoId));
    }
}
