package br.com.bootcamp.exer8.exceptions;

public class SaiElevadorException extends ElevadorException{
    public SaiElevadorException() {
        super("Nenhuma pessoa esta no elevador :(");
    }
}
