package br.com.bootcamp.test;

import br.com.bootcamp.model.Calculadora;

public class Exer2 {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.Multiplicar(15, 3));
        System.out.println(calculadora.Dividir(15., 45.6));
        System.out.println(calculadora.Somar(15, 3));
    }
}
