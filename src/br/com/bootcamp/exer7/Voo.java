package br.com.bootcamp.exer7;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Voo {
    private Integer numeroDoVoo;
    private LocalDateTime dataEHora;
    private Integer numMáximoAssentos;
    private List<Passageiros> passageiros = new ArrayList<>(5);
    private Integer quantMaxPassageiros;

    public Voo(Integer numeroDoVoo,
               LocalDateTime dataEHora,
               Integer numMáximoAssentos,
               Integer quantMaxPassageiros) {
        this.numeroDoVoo = numeroDoVoo;
        this.dataEHora = dataEHora;
        this.numMáximoAssentos = passageiros.size();
        this.quantMaxPassageiros = quantMaxPassageiros;
    }

    public Integer primeiroLivre(Integer assentos) {
        int posicaoLivre = 0;
        for(int i = 0;i < passageiros.size(); i++) {
            posicaoLivre = passageiros.get(i).getId();
            if(posicaoLivre >= passageiros.size()) {
                System.out.println("Nao tem nenhum assento disponivel");
            }else {

            }

        }
        return posicaoLivre;
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
