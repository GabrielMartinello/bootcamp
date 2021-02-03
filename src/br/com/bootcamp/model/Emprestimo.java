package br.com.bootcamp.model;

import java.time.LocalDate;

public class Emprestimo {
    private LocalDate dataEmprestimo;

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
}
