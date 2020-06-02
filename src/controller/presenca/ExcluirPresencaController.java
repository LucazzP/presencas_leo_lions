package controller.presenca;


import dao.PresencaDAO;
import dao.ReuniaoDAO;
import view.presenca.ExcluirPresencaView;
import view.reuniao.ExcluirReuniaoView;

public class ExcluirPresencaController {
    public ExcluirPresencaController() {
        ExcluirPresencaView view = new ExcluirPresencaView();
        int idReuniao = view.digitarIdReunião();
        int idUser = view.digitarIdUsuario();
        if (idUser > 0 && idReuniao > 0) {
            PresencaDAO dao = new PresencaDAO();
            dao.deletar(idReuniao, idUser);
            view.sucesso(idReuniao, idUser);
        }
    }
}
