package br.com.bootcamp.test;

import br.com.bootcamp.model.Aluno;
import br.com.bootcamp.model.Livro;
import br.com.bootcamp.model.SolicitacaoEmprestimo;

import java.time.LocalDate;
import java.time.Month;

public class Exer4 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Joao");
        Livro livro = new Livro("Piloto de Hitler",1);
        Livro livro2 = new Livro("Mr Mercedes",2);

        SolicitacaoEmprestimo solicitacaoEmprestimo = new SolicitacaoEmprestimo(aluno,
                livro,
                LocalDate.of(2020, Month.FEBRUARY,2));

    }

}
