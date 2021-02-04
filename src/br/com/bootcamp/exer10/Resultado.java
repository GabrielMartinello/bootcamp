package br.com.bootcamp.exer10;

public class Resultado {
    private String especie;
    private Integer quantidade;

    public Resultado(String especie, Integer quantidade) {
        if(quantidade == null) {
            System.out.println("O campo é ''Quantidade'' obrigatório! ");
        }
        if(especie == null) {
            System.out.println("O campo ''Especie'' é obrigatório!");;
        }
        this.especie = especie;
        this.quantidade = quantidade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
