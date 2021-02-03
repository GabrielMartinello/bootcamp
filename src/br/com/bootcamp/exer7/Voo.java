package br.com.bootcamp.exer7;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Voo {
    private Integer numeroDoVoo;
    private LocalDateTime dataEHora;
    private Integer numMáximoAssentos;
    private List<Passageiros> passageiros = new ArrayList<>();
    private Integer quantMaxPassageiros;

    public Voo(Integer numeroDoVoo,
               LocalDateTime dataEHora,
               Integer numMáximoAssentos,
               Integer quantMaxPassageiros) {
        this.numeroDoVoo = numeroDoVoo;
        this.dataEHora = dataEHora;
        this.numMáximoAssentos = numMáximoAssentos;
        this.quantMaxPassageiros = quantMaxPassageiros;
    }

    public Integer primeiroLivre(Integer assentos) {
        int posicao = 0;
        for(int i = 0;i < passageiros.size(); i++) {


        }

    }

    public void proximoLivre() {

    }

    public void verifica() {

    }

    public void ocupa() {

    }

    public void vagas() {

    }

    public void assentosLivres() {

    }

    public Integer getNumeroDoVoo() {
        return numeroDoVoo;
    }

    public LocalDateTime getDataEHora() {
        return dataEHora;
    }
}
