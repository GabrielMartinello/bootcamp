package br.com.bootcamp.Exer3;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        GrupoDePessoas grupoDePessoas = new GrupoDePessoas();
        Pessoa pessoa = new Pessoa("Gabriel", "martinellogabriel@gmail.com",
                LocalDate.of(2002, Month.AUGUST, 7));
        grupoDePessoas.AdicionaPessoas(pessoa);

        for(int i = 0;i < grupoDePessoas.getPessoaList().size();i++){
            Pessoa pessoaAtual = grupoDePessoas.getPessoaList().get(i);
            System.out.println("Pessoa atual " + pessoaAtual);
        }

        grupoDePessoas.menorIdade();
        grupoDePessoas.maiorIdade();

    }
}
