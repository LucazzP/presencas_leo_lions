package controller.reuniao;


import dao.ReuniaoDAO;
import view.reuniao.ExcluirReuniaoView;

public class ExcluirReuniaoController {
    public ExcluirReuniaoController(){
        ExcluirReuniaoView view = new ExcluirReuniaoView();
        int idUser = view.digitarId();
        if(idUser > 0){
            ReuniaoDAO dao = new ReuniaoDAO();
            dao.deletarReuniao(idUser);
            view.sucesso(idUser);
        }
    }
}
