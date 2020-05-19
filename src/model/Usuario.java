
package model;


import utils.PasswordUtils;

public class Usuario {

    final private int id;
    final private String nome;
    final private String senha;
    final private int idade;
    final private String email;
    final private int permissao;
    final private String salt;

    public Usuario(String nome, String senha, int idade, String email, boolean administrador) {
        this.salt = PasswordUtils.getSalt(20);
        this.id = -1;
        this.nome = nome;
        this.senha = PasswordUtils.generateSecurePassword(senha, salt);
        this.idade = idade;
        this.email = email;
        this.permissao = administrador ? 10 : 0;
    }

    public Usuario(String nome, String senha, int idade, String email, boolean administrador, String salt) {
        this.id = -1;
        this.nome = nome;
        this.senha = PasswordUtils.generateSecurePassword(senha, salt);
        this.idade = idade;
        this.email = email;
        this.permissao = administrador ? 10 : 0;
        this.salt = salt;
    }

    public Usuario(int id, String nome, String senha, int idade, String email, int permissao, String salt) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.idade = idade;
        this.email = email;
        this.permissao = permissao;
        this.salt = salt;
    }

    public String getSalt() {
        return salt;
    }

    public int getPermissao() {
        return permissao;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }
}
