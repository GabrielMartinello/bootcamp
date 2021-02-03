package br.com.bootcamp.model;

import java.time.LocalDate;

public class Emprestimo {
    private boolean devolvido;

    public void devolver() {
        this.devolvido = true;
    }

    public boolean foiDevolvido() {
        return devolvido;
    }
}
