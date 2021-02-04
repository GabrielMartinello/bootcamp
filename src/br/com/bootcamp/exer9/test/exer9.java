package br.com.bootcamp.exer9.test;

import br.com.bootcamp.exer6.BigDecimalUtil;
import br.com.bootcamp.exer9.model.Carro;
import br.com.bootcamp.exer9.model.Endereco;
import br.com.bootcamp.exer9.model.Marca;
import br.com.bootcamp.exer9.model.Propretario;

import java.math.BigDecimal;

public class exer9 {
    public static void main(String[] args) {
        Marca marca = new Marca("Pegeout", 2021, 123);
        Endereco endereco = new Endereco("Industrial","Pato Branco","PR");
        Propretario propretario = new Propretario("Gabriel Martinello",
                "09049763944",
                "55555555555",
                endereco);

        Integer velocidadeMaxima = 20;
        Integer numeroMarchas = 5;
        BigDecimal quantidadeCombustivel = BigDecimal.TEN;
        Carro carro = new Carro("Merces",
                "Azul",
                marca,
                "asghdsadhusahd",
                propretario,
                velocidadeMaxima,
                6,
                numeroMarchas,
                quantidadeCombustivel,
                30,
                6);

        carro.freia();
        carro.acelera();
        carro.trocarDeMarcha();
    }
}
