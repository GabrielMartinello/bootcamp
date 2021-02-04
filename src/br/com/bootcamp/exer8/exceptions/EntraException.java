package br.com.bootcamp.exer8.exceptions;

public class EntraException extends ElevadorException{
    public EntraException() {
        super("Nenhuma pessoa esta no elevador");
    }
}
