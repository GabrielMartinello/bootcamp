package br.com.bootcamp.exer2;

import br.com.bootcamp.exer2.Calculadora.Calculadora;

public class Main {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.Multiplicar(15, 3));
        System.out.println(calculadora.Dividir(15., 45.6));
        System.out.println(calculadora.Somar(15, 3));
    }
}
