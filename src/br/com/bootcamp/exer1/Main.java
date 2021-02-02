package br.com.bootcamp.exer1;

import br.com.bootcamp.exer1.Pessoa.Pessoa;
import br.com.bootcamp.exer1.endereco.Endereco;
import br.com.bootcamp.exer1.Telefones.Telefone;
import br.com.bootcamp.exer1.Telefones.TipoTelefone;

import java.util.Arrays;

public class Main {
//Exercicio 1

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Joao",
                "Pessoa",
                "090.497.639-44",
                "Gabriel@gmail.com",
                "07/08/2004",
                Arrays.asList(new Telefone("12233344", TipoTelefone.CELULAR)),
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

