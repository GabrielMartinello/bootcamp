package br.com.bootcamp.exer10;

public enum Especie {
    AVES("Aves"),
    MAMIFEROS("Mamiferos"),
    PEIXES("Peixes"),
    REPTEIS("Repteis");

    private String descricao;

    Especie(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
