package br.com.bootcamp.test;

import br.com.bootcamp.model.Pessoa;
import br.com.bootcamp.model.Endereco;
import br.com.bootcamp.model.Telefone;
import br.com.bootcamp.model.TipoTelefoneExer1;

import java.util.Arrays;

public class Exer1 {
//Exercicio 1

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Joao",
                "Pessoa",
                "090.497.639-44",
                "Gabriel@gmail.com",
                "07/08/2004",
                Arrays.asList(new Telefone("12233344", TipoTelefoneExer1.CELULAR)),
                Arrays.asList(
                        new Endereco("Francisco Brochado da Rocha",
                                309,
                                "Industrial")
                )
        );
        System.out.println("------------------------------------------------");
        System.out.println(pessoa.toString());
        System.out.println("------------------------------------------------");
    }

}


