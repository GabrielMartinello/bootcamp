package br.com.bootcamp.model;

public class Calculadora {

    public Integer Somar(Integer numero1,
                         Integer numero2) {
        return numero1 + numero2;
    }

    public Integer Multiplicar(Integer numero1,
                               Integer numero2) {
        return numero1 * numero2;
    }

    public Double Dividir(Double numero1,
                          Double numero2) {
        return (numero1 / numero2);
    }

    public Integer Subtrair(Integer numero1,
                         Integer numero2) {
        return numero1 - numero2;
    }
}
