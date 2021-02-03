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
        System.out.println("-------------------------------------");

        banco.insere(
                new ContaCorrente("101", BigDecimal.valueOf(50))
        );

        banco.procuraContaNaLista("101");
        banco.remove(contaCorrente);
        System.out.println("------------------------------------");


    }
}

