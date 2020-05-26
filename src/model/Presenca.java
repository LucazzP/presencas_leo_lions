package model;

public class Presenca {
    final private int idReuniao;
    final private int idUser;

    public Presenca(int idReuniao, int idUser) {
        this.idReuniao = idReuniao;
        this.idUser = idUser;
    }

    public int getIdReuniao() {
        return idReuniao;
    }

    public int getIdUser() {
        return idUser;
    }
}
