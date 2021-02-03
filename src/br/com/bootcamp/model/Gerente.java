package br.com.bootcamp.model;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends EmpregadoComissionado{

    private double ajudaDeCusto;
    private double percentualComissao;
    private List<EmpregadoComissionado> vendedor = new ArrayList<>();

    public Gerente(String nome,
                   String cpf,
                   double valorSalarioBase,
                   double valorImpostos,
                   double valorProdutosVendidos,
                   double percentualComissao,
                   double valorComissao,
                   double ajudaDeCusto) {
        super(nome,
                cpf,
                valorSalarioBase,
                valorImpostos,
                valorProdutosVendidos,
                percentualComissao,
                valorComissao);
        this.ajudaDeCusto = ajudaDeCusto;
        this.percentualComissao = percentualComissao;
    }

    public List<EmpregadoComissionado> getVendedor() {
        return vendedor;
    }

    public void insereNaLista(EmpregadoComissionado vendedor) {
        getVendedor().add(vendedor);
    }

    public void mostraDados() {
        for (int i = 0; i < vendedor.size(); i++) {
            System.out.println(vendedor.get(i));
        }
    }

    @Override
    public double calculaValorTotalDoSalario() {
        double totalVendas = 0;
        for (int i = 0; i < vendedor.size(); i++) {
            totalVendas = totalVendas + vendedor.get(i).getValorProdutosVendidos();
        }
        return getValorSalarioBase() + totalVendas + ajudaDeCusto +
                getPercentualComissao() - getValorImpostos();
    }

    @Override
    public String toString() {
        return
                "\najudaDeCusto = " + ajudaDeCusto +
                "\npercentualComissao = " + percentualComissao +
                "\nvendedor = " + vendedor;
    }
}
