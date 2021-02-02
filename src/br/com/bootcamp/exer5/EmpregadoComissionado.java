package br.com.bootcamp.exer5;

public class EmpregadoComissionado extends Empregado {
    private double valorProdutosVendidos;
    private double percentualComissao;
    private double valorComissao;


    public EmpregadoComissionado(String nome,
                                 String cpf,
                                 double valorSalarioBase,
                                 double valorImpostos,
                                 double valorProdutosVendidos,
                                 double percentualComissao,
                                 double valorComissao) {
        super(nome, cpf, valorSalarioBase, valorImpostos);
        this.valorProdutosVendidos = valorProdutosVendidos;
        this.percentualComissao = percentualComissao;
        this.valorComissao = (valorProdutosVendidos * percentualComissao) / 100;
    }


    @Override
    public double calculaValorTotalDoSalario() {
        return getValorSalarioBase() + valorComissao - getValorImpostos();
    }

    public double getValorProdutosVendidos() {
        return valorProdutosVendidos;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }


    public double getValorComissao() {
        return valorComissao;
    }

    @Override
    public String toString() {
        return "valorProdutosVendidos = " + valorProdutosVendidos +
                "\npercentualComissao = " + percentualComissao +
                "\nvalorComissao=" + valorComissao +
                "\n";
    }
}
