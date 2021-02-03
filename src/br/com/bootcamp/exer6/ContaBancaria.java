package br.com.bootcamp.exer6;

import java.math.BigDecimal;

abstract class ContaBancaria {
    private String numeroConta;
    private BigDecimal saldo;

    public ContaBancaria(String numeroConta, BigDecimal saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public abstract void sacar(BigDecimal valor);

    public abstract void depositar(BigDecimal valor);

    public String getNumeroConta() {
        return numeroConta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "numeroConta = " + numeroConta +
                ", saldo = " + saldo;
    }
}
