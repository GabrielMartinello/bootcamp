package br.com.bootcamp.Exer3;

import java.time.LocalDate;
import java.util.List;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String cpf;
    private String email;
    private LocalDate dataNasc;
    GrupoDePessoas grupoDePessoas;

    public Pessoa(String nome,
                  String email,
                  LocalDate dataNasc) {
        this.nome = nome;
        this.email = email;
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override
    public String toString() {
        return
                "nome = " + nome  +
                "\nsobrenome = " + sobrenome +
                "\nCPF = " + cpf +
                "\nemail = " + email +
                "\ndataNasc = " + dataNasc;
    }
}
