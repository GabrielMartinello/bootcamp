package br.com.bootcamp.exer12.exceptions;

public class ItemException extends CampoNullException{
    public ItemException() {
        super("Não é possível adicionar valores igual a zero!");
    }
}
