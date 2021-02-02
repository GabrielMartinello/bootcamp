package br.com.bootcamp.exer6;

import java.math.BigDecimal;

abstract class ContaBancaria {
    private Integer numeroConta;
    private Double saldo;

    abstract void sacar(BigDecimal valor);

    abstract void depositar(BigDecimal valor);
}
