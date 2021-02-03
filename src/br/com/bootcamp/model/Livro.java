package br.com.bootcamp.model;

public class Livro {
    private String nome;
    private int id;

    public Livro(String nome, Integer id) {
        this.nome = nome;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
