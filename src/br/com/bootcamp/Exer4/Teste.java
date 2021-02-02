package br.com.bootcamp.Exer4;

import java.time.LocalDate;
import java.time.Month;

public class Teste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Joao");
        Livro livro = new Livro("Piloto de Hitler",1);
        Livro livro2 = new Livro("Mr Mercedes",2);

        SolicitacaoEmprestimo solicitacaoEmprestimo = new SolicitacaoEmprestimo(aluno,
                livro,
                LocalDate.of(2020, Month.FEBRUARY,2));

    }

}
