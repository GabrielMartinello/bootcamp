package br.com.bootcamp.exer6;

import java.math.BigDecimal;

public class ContaPoupanca extends ContaBancaria{
    private double taxaDeOperacao;

    public ContaPoupanca(String numeroConta,
                         BigDecimal saldo) {
        super(numeroConta, saldo);
    }

    public double getTaxaDeOperacao() {
        return taxaDeOperacao;
    }

    @Override
    public void sacar(BigDecimal valor) {
        taxaDeOperacao = 50;
        if (getSaldo().compareTo(valor) >= 0) {
            setSaldo(getSaldo().subtract(valor).subtract(BigDecimal.valueOf(taxaDeOperacao)));
            System.out.println("Taxa de saque: " + taxaDeOperacao);
        } else {
            System.out.println("O limite estourou e voce nao tem mais nada!");
        }
    }

    @Override
    public void depositar(BigDecimal valor) {
        taxaDeOperacao = 100;
        setSaldo(getSaldo().add(valor).subtract(BigDecimal.valueOf(taxaDeOperacao)));
        System.out.println("Taxa de Deposito: " + taxaDeOperacao);
    }
}
