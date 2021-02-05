package br.com.bootcamp.exer10;

public class Resultado {

    private final Especie especie;
    private final Integer quantidade;

    public Resultado(Especie especie, Integer quantidade) {
        this.especie = especie;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Resultado{" +
                "especie=" + especie +
                ", quantidade=" + quantidade +
                '}';
    }
}
