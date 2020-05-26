package model;

import java.util.Date;

public class Reuniao {
    final private int id;
    final private Date data;
    final private int numero;

    public Reuniao(Date data, int numero) {
        this.id = -1;
        this.data = data;
        this.numero = numero;
    }

    public Reuniao(int id, Date data, int numero) {
        this.id = id;
        this.data = data;
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

    public int getNumero() {
        return numero;
    }
}
