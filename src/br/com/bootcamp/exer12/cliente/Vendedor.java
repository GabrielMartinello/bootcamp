package br.com.bootcamp.exer12.cliente;

import br.com.bootcamp.exer12.exceptions.CampoNullException;

public class Vendedor {
    private Long id;
    private String nome;
    private Double percentualComissao;
    private Double percentualDesconto;

    public Vendedor(Long id,
                    String nome,
                    Double percentualComissao,
                    Double percentualDesconto) {
        if(nome == null) {
            throw new CampoNullException("Campo nome Obrigatório!");
        }
        this.id = id;
        this.nome = nome;
        this.percentualComissao = percentualComissao;
        this.percentualDesconto = percentualDesconto;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(Double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public Double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(Double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }
}
