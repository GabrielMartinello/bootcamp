package br.com.bootcamp.exer12.pedido;

import br.com.bootcamp.exer12.exceptions.CampoNullException;

public class Item {
    private Long id;
    private String descricao;
    private char simNao;
    private Integer quantidadeEmEstoque;
    private Double valorUnitario;

    public Item(Long id,
                String descricao,
                char simNao,
                Integer quantidadeEmEstoque,
                Double valorUnitario) {
        if(quantidadeEmEstoque == null) {
            throw new CampoNullException("Campo Obrigatório!");
        }
        this.id = id;
        this.descricao = descricao;
        this.simNao = simNao;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.valorUnitario = valorUnitario;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setSimNao(char simNao) {
        this.simNao = simNao;
    }

    public void setQuantidadeEmEstoque(Integer quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public char getSimNao() {
        return simNao;
    }

    public Integer getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }
}
