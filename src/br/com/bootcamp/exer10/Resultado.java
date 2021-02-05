package br.com.bootcamp.exer10;

public class Resultado {
    private Especie especie;
    private Integer quantidade;

    public Resultado(Especie especie, Integer quantidade) {
        if(quantidade == null) {
            System.out.println("O campo é ''Quantidade'' obrigatório! ");
        }
        if(especie == null) {
            System.out.println("O campo ''Especie'' é obrigatório!");;
        }
        this.especie = especie;
        this.quantidade = quantidade;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
