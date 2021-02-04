package br.com.bootcamp.exer8.exceptions;

public class SobeException extends ElevadorException{

    public SobeException() {
        super("Já esta no ultimo andar :(");
    }
}
