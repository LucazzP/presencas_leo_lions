package controller.reuniao;


import dao.ReuniaoDAO;
import view.reuniao.ListarReuniaoView;

public class ListarReunioesController {
    public ListarReunioesController(){
        ReuniaoDAO dao = new ReuniaoDAO();

        ListarReuniaoView view = new ListarReuniaoView();
        view.listar(dao.listarReuniao());
    }
}
