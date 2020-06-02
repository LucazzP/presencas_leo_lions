package dev.polazzo;

import controller.MenuController;
import controller.usuario.LoginUsuarioController;
import dao.VerificarTables;

public class Main {

    public static void main(String[] args) {
        if(!new VerificarTables().verificar()) {
            new LoginUsuarioController().login();
        }
        MenuController menuController = new MenuController();
    }
}
