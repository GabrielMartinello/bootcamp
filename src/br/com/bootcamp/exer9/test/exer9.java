package br.com.bootcamp.exer9.test;

import br.com.bootcamp.exer9.model.Carro;
import br.com.bootcamp.exer9.model.Endereco;
import br.com.bootcamp.exer9.model.Propretario;

public class exer9 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Industrial","Pato Branco","PR");
        Propretario propretario = new Propretario("Gabriel Martinello",
                "09049763944",
                "55555555555",
                endereco);
        Carro carro = new Carro(60.,propretario,43);
        carro.acelera();
        carro.freia();
        carro.freia();
        carro.freia();
        carro.trocarDeMarcha();
    }
}
