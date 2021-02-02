package br.com.bootcamp.Exer4;

import java.time.LocalDate;

public class SolicitacaoEmprestimo {
    private Aluno aluno;
    private Livro livro;
    private LocalDate data;
    private Emprestimo emprestimo;

    public SolicitacaoEmprestimo(Aluno aluno, Livro livro, LocalDate data) {
        this.aluno = aluno;
        this.livro = livro;
        this.data = data;
    }

    public void solicitaEmp(Emprestimo emp){
            System.out.println("Nome:" + aluno.getNome());
            System.out.println("Data: " + emp.getDataEmprestimo());
            System.out.println("Livro: " + livro.getNome());
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }
}