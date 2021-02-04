package br.com.bootcamp.test;

import br.com.bootcamp.exer6.Banco;
import br.com.bootcamp.exer6.ContaCorrente;
import br.com.bootcamp.exer6.Relatorio;

import java.math.BigDecimal;

public class exer6 {

    public static void main(String[] a) {
        popularOsAtributos();
    }

    public static void popularOsAtributos() {
        System.out.println("---------------- Exer 6 --------------");
        Relatorio relatorio = new Relatorio();
        Banco banco = new Banco();
        ContaCorrente contaCorrente = new ContaCorrente("001", BigDecimal.valueOf(50));
        ContaCorrente contaCorrente02 = new ContaCorrente("002", BigDecimal.valueOf(50));
        ContaCorrente contaCorrente03 = new ContaCorrente("003", BigDecimal.valueOf(50));
        System.out.println("-------------------------------------");

        banco.insere(contaCorrente);
        banco.insere(contaCorrente02);
        banco.insere(contaCorrente03);

        banco.remove(contaCorrente);
        banco.remove(contaCorrente02);
        System.out.println("------------------------------------");
    }
}

