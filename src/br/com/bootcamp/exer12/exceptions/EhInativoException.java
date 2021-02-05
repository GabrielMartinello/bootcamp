package br.com.bootcamp.exer12.exceptions;

public class EhInativoException extends CampoNullException {
    public EhInativoException() {
        super("Não é possivel adicionar itens inativos");
    }
}
