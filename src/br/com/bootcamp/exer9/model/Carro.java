package br.com.bootcamp.exer9.model;

import br.com.bootcamp.exer9.exceptions.*;

import java.math.BigDecimal;

public class Carro {
    private final String modelo;
    private final String cor;
    private final Marca marca;
    private final String chassi;
    private final Propretario proprietario;
    private final Integer velocidadeMaxima;
    private final Integer numeroPortas;
    private final Integer numeroMarchas;
    private final BigDecimal quantidadeCombustivel;
    private Integer velocidadeAtual;
    private Integer marchaAtual;


    public Carro(String modelo,
                 String cor,
                 Marca marca,
                 String chassi,
                 Propretario proprietario,
                 Integer velocidadeMaxima,
                 Integer numeroPortas,
                 Integer numeroMarchas,
                 BigDecimal quantidadeCombustivel,
                 Integer velocidadeAtual,
                 Integer marchaAtual) {
        this.modelo = modelo;
        this.cor = cor;
        this.marca = marca;
        this.chassi = chassi;
        this.proprietario = proprietario;
        this.velocidadeMaxima = velocidadeMaxima;
        this.numeroPortas = numeroPortas;
        this.numeroMarchas = numeroMarchas;
        this.quantidadeCombustivel = quantidadeCombustivel;
        this.velocidadeAtual = 0;
        this.marchaAtual = 0;

        if(quantidadeCombustivel == null) {
            throw new CarroException("A quantidade de comb é obrigatoria");
        }

        if(proprietario == null) {
            throw new CarroException("O proprietário é obrigatório");
        }

    }


    public BigDecimal calcularAutonomia(BigDecimal consumoMedio) {
        return consumoMedio.multiply(quantidadeCombustivel);
    }

    public void acelera() {
        if ((velocidadeAtual.equals(velocidadeMaxima))) {
            throw new AceleraException();
        }
        velocidadeAtual += 1;
        System.out.println("A vida não tem mais sentido" + velocidadeAtual);
    }

    public void freia() {
        velocidadeAtual = 0;
        System.out.println("Errr seguraaa grudei nos freios");
    }

    public void trocarDeMarcha() {
        if(marchaAtual.equals(numeroMarchas)) {
            throw new CarroTrocaMarchaException("Já está no min");
        }
        marchaAtual += 1;
        System.out.println("Ran dan dan aumentou uma marcha: " + numeroMarchas);
    }

    public void reduzirMarcha() {
        if(marchaAtual == 1 && velocidadeAtual > 0) {
            throw new CarroException("O re so pode ser engatado na marcha 0");
        }
        if(marchaAtual == 0) {
            throw new CarroTrocaMarchaException("Esta na marcha min");
        }
        marchaAtual -= 1;
        System.out.println("Ta em ponto morto nao andaa " + marchaAtual);
    }

    public Marca getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getChassi() {
        return chassi;
    }

    public Propretario getProprietario() {
        return proprietario;
    }

    public Integer getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public Integer getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public Integer getNumeroPortas() {
        return numeroPortas;
    }

    public Integer getNumeroMarchas() {
        return numeroMarchas;
    }

    public Integer getMarchaAtual() {
        return marchaAtual;
    }

    public BigDecimal getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }
}
