package br.com.bootcamp.Exercicio1.Endereco;

public class Endereco {
    private String  endereco;
    private Integer numero;
    private String  bairro;

    public Endereco(String endereco,
                    Integer numero,
                    String bairro) {
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return  "endereco = " + endereco +
                " / numero = " + numero +
                " / bairro = " + bairro;
    }
}
