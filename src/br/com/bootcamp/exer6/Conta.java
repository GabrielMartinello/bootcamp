package br.com.bootcamp.exer6;

import java.math.BigDecimal;

abstract class Conta implements Imprimivel{
    private String numeroConta;
    protected BigDecimal valorSaldo = BigDecimal.ZERO;

    public Conta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public abstract void sacar(BigDecimal valor);

    public abstract void depositar(BigDecimal valor);

    public String getNumeroConta() {
        return numeroConta;
    }

    public BigDecimal getValorSaldo() {
        return valorSaldo;
    }

    @Override
    public String toString() {
        return "numeroConta = " + numeroConta +
                ", saldo = " + BigDecimalUtil.setScale(valorSaldo);
    }
}
