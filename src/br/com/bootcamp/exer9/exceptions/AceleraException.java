package br.com.bootcamp.exer9.exceptions;

public class AceleraException extends CarroException{
    public AceleraException() {
        super("Você ultrapassou o limite de velocidade!");
    }
}
