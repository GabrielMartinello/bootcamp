package br.com.bootcamp.exer5;

public class Empregado extends Pessoa {

    private double valorSalarioBase;
    private double valorImpostos;

    public Empregado(String nome,
                     String cpf,
                     double valorSalarioBase,
                     double valorImpostos) {
        /* chama o construtor da classe pessoa */
        super(nome, cpf);
        this.valorImpostos = valorImpostos;
        this.valorSalarioBase = valorSalarioBase;
    }

    public double calculaValorTotalDoSalario() {
        return valorSalarioBase - valorImpostos;
    }

    public double getValorImpostos() {
        return valorImpostos;
    }

    public String mostrarNome() {
        return this.getNome();
    }

    public String mostrarCpf() {
        return this.getCpf();
    }

    public double getValorSalarioBase() {
        return valorSalarioBase;
    }

}
