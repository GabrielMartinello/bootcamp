package br.com.bootcamp.exer8.exceptions;

public class ElevadorDesceException extends ElevadorException{

    public ElevadorDesceException() {
        super("Já esta no terreo");
    }
}
