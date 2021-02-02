package br.com.bootcamp.exer5Herança;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Empregado("Gabriel Borrichello", "090.497.639-44",
                1000., 400.);

        System.out.println(((Empregado) pessoa).mostrarCpf());
        System.out.println(((Empregado) pessoa).mostrarNome());
        double valor2 = ((Empregado) pessoa).calculaValorTotalDoSalario();
        System.out.println(valor2);

        EmpregadoComissionado comissionado = new EmpregadoComissionado("Gabriel",
                "048448", 1000, 400, 300.,
                20, 700);

        double salarioComissioando = comissionado.calculaValorTotalDoSalario();
        System.out.println("salario Comissioando: " + salarioComissioando);


        Gerente gerente = new Gerente("Gabriel", "111223", 1000,
                400, 300, 20, 700,
                150);

        gerente.insereNaLista(new EmpregadoComissionado("Gabriel", "09049", 500,
                40., 400., 30., 50.));

        gerente.insereNaLista(new EmpregadoComissionado("Joao cleber", "56465466", 500,
                40., 400., 30., 50.));

        double salarioGerente = gerente.calculaValorTotalDoSalario();
        System.out.println("Salario Gerente: " + salarioGerente);
        System.out.println("-----------------------------");
        gerente.mostraDados();
        System.out.println("-----------------------------");

    }

}
