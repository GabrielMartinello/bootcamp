package br.com.bootcamp.exer10.mamiferos;

import br.com.bootcamp.exer10.Animal;
import br.com.bootcamp.exer10.Especie;

public class Cachorro implements Animal {

    private Especie especie;
    private String nome;

    public Cachorro(Especie especie, String nome) {
        this.especie = especie;
        this.nome = nome;
    }

    @Override
    public Especie getEspecie() {
        return especie;
    }

    @Override
    public String getNome() {
        return nome;
    }
}
