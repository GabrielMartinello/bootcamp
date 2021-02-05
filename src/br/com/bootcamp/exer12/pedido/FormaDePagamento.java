package br.com.bootcamp.exer12.pedido;

import java.io.Serializable;

public enum FormaDePagamento implements Serializable {
    DINHEIRO("Dinheiro!"),
    CARTAO("Cartao"),
    BOLETO("Boleto");

    private String label;

    FormaDePagamento(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
