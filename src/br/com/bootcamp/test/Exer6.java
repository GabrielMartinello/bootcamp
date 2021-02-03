package br.com.bootcamp.test;

import br.com.bootcamp.exer6.ContaCorrente;

import java.math.BigDecimal;

public class Exer6 {
    public static void main(String[] args) {
//        ContaPoupanca cp = new ContaPoupanca("156",
//                BigDecimal.valueOf(500));
//
//        cp.depositar(BigDecimal.valueOf(9000.));
//        cp.sacar(BigDecimal.valueOf(1800));
//        System.out.println("Saldo: " + cp.getSaldo());
//        System.out.println(cp);
//        System.out.println("");

        ContaCorrente cc = new ContaCorrente("506",
                BigDecimal.valueOf(1000),
                50);
        cc.depositar(BigDecimal.valueOf(50));
        cc.sacar(BigDecimal.valueOf(50));
        System.out.println("Saldo: " + cc.getSaldo());
    }
}
