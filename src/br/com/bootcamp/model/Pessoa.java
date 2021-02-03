package br.com.bootcamp.model;

import java.time.LocalDate;
import java.util.List;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String cpf;
    private String email;
    private String dataNasc;
    private List<Endereco> endereco;
    private List<Telefone> telefones;

    public Pessoa(String nome,
                  String sobrenome,
                  String cpf,
                  String email,
                  String dataNasc,
                  List<Telefone> telefones,
                  List<Endereco> endereco
                 ) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.email = email;
        this.dataNasc = dataNasc;
        this.telefones = telefones;
        this.endereco = endereco;
    }

    public List<Endereco> getEndereco() {
        return endereco;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public List<Endereco> endereco() {
        return endereco;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }

    public List<Telefone> getTelefoneLista() {
        return telefones;
    }

    public void setTelefoneLista(List<Telefone> telefoneLista) {
        telefones = telefoneLista;
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

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate String) {
        this.dataNasc = dataNasc;
    }

    @Override
    public String toString() {
        return "nome = " + nome +
                "\nsobrenome = " + sobrenome +
                "\ncpf = " + cpf +
                "\nemail = " + email +
                "\ndataNasc = " + dataNasc +
                "\nendereco = " + endereco +
                "\ntelefones = " +  telefones;
    }
}
