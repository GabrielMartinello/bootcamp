package br.com.bootcamp.exer9.model;

import java.time.LocalDate;

public class Marca {
    private String nome;
    private Integer ano;
    private int id;

    public Marca(String nome, Integer ano, Integer id) {
        this.nome = nome;
        this.ano = ano;
        this.id = id;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return nome;
    }

    public void setMarca(String marca) {
        this.nome = marca;
    }
}
