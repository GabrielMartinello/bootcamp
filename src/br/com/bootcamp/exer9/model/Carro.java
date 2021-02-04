package br.com.bootcamp.exer9.model;

import br.com.bootcamp.exer9.exceptions.*;

public class Carro {
    private Propretario propretario;
    private String chassi;
    private Integer velocidadeMax;
    private Integer velocidadeAtual;
    private Integer numeroPortas;
    private Integer numeroMarchas;
    private Double quantidadeComb;
    private Marca marca;


    public Carro(Double quantidadeComb,
                 Propretario propretario,
                 Integer velocidadeAtual) {
        this.quantidadeComb = quantidadeComb;
        this.propretario = propretario;
        this.velocidadeAtual = velocidadeAtual;
        this.velocidadeMax = 60;
        this.numeroMarchas = 6;
    }

    public void autonomia(Double consumoMedio) {
        double autonomia = consumoMedio * quantidadeComb;
        System.out.println("Autonomia: " + autonomia);
    }

    public void daRe() {
        if(velocidadeAtual > 0) {
            throw new ReException();
        }
        velocidadeAtual = 0;
        System.out.println("Dando ré");
    }

    public void acelera() {
        if ((velocidadeAtual > velocidadeMax)) {
            throw new AceleraException();
        }
        velocidadeAtual += 1;
        System.out.println("A vida não tem mais sentido");
    }

    public void freia() {
        if (velocidadeAtual == 0) {
            throw new FreiaException();
        }
        velocidadeAtual -= 1;
        System.out.println("Errr seguraaa grudei nos freios");
    }

    public void trocarDeMarcha() {
        if(numeroMarchas == 0) {
            throw new AumentaMarchaException();
        }
        numeroMarchas += 1;
        System.out.println("Ran dan dan aumentou uma marcha: " + numeroMarchas);
    }

    public void reduzirMarcha() {
        if(numeroMarchas == 0) {
            throw new DiminiuMarchaException();
        }
        numeroMarchas -= 1;
        System.out.println("Ta em ponto morto nao andaa");
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Propretario getPropretario() {
        return propretario;
    }

    public void setPropretario(Propretario propretario) {
        this.propretario = propretario;
    }

    public Integer getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(Integer velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public Integer getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(Integer velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public Integer getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(Integer numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public Integer getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(Integer numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public Double getQuantidadeComb() {
        return quantidadeComb;
    }

    public void setQuantidadeComb(Double quantidadeComb) {
        this.quantidadeComb = quantidadeComb;
    }
}
