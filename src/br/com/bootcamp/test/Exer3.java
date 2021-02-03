package br.com.bootcamp.test;

import br.com.bootcamp.model.GrupoDePessoas;
import br.com.bootcamp.model.Pessoa2;

import java.time.LocalDate;
import java.time.Month;

public class Exer3 {
    public static void main(String[] args) {
        GrupoDePessoas grupoDePessoas = new GrupoDePessoas();
        Pessoa2 pessoa = new Pessoa2("Gabriel", "martinellogabriel@gmail.com",
                LocalDate.of(2002, Month.AUGUST, 7));
        grupoDePessoas.AdicionaPessoas(pessoa);

        for(int i = 0;i < grupoDePessoas.getPessoaList().size();i++){
            Pessoa2 pessoaAtual = grupoDePessoas.getPessoaList().get(i);
            System.out.println("Pessoa atual " + pessoaAtual);
        }

        grupoDePessoas.menorIdade();
        grupoDePessoas.maiorIdade();

    }
}
