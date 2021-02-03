package br.com.bootcamp.exer7;

public class Passageiros {
    private String nome;
    private Integer id;

    public Passageiros(String nome, Integer id) {
        this.nome = nome;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
