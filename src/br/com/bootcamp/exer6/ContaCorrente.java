package br.com.bootcamp.exer6;

import java.math.BigDecimal;

public class ContaCorrente extends ContaBancaria{
    private double limite;

    public ContaCorrente(String numeroConta,
                         BigDecimal saldo,
                         double limiteCredito) {
        super(numeroConta,
                saldo);
        this.limite = limiteCredito;
    }

    @Override
    public void sacar(BigDecimal valor) {
        if (getSaldo().compareTo(valor) >= 0) {
            setSaldo(getSaldo().subtract(valor));
            System.out.println("Saque realizado com sucesso");

        } else if (getSaldo().compareTo(valor) <= 0){
            setSaldo((BigDecimal.valueOf(limite)));
            System.out.println("Limite Crédito: " + limite);
        }else {
            System.out.println("O limite estourou e não temos mais nada :(");
        }

    }

    @Override
    public void depositar(BigDecimal valor) {
        setSaldo(getSaldo().add(valor));
        System.out.println("Deposito realizado com sucesso :)");
    }
}
