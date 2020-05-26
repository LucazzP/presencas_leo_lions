package controller.reuniao;

import dao.ReuniaoDAO;
import model.Reuniao;
import view.reuniao.EditarReuniaoView;

public class EditarReuniaoController {
    public EditarReuniaoController() {
        EditarReuniaoView view = new EditarReuniaoView();
        int idUser = view.digitarId();
        if (idUser > 0) {
            ReuniaoDAO dao = new ReuniaoDAO();
            Reuniao usuario = dao.getReuniao(idUser);
            if (usuario == null) {
                System.out.println("Id de usuario inválido");
                return;
            }
            Reuniao newUsuario = view.editar(usuario);
            dao.editarReuniao(newUsuario);
        }
    }
}
