package br.com.bootcamp.Exer3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GrupoDePessoas {

    private List<Pessoa> grupoDePessoas = new ArrayList<>();

    public void AdicionaPessoas(Pessoa pessoa) {
        if (naoTem18Anos(pessoa)) {
            System.out.println(pessoa.getNome() +
                    " Voce Nao pode entrar por que nasceu na data de: " +
                    pessoa.getDataNasc() +
                    "Entao voce nao tem 18 anos");
        } else {
            // tem 18 anos
            grupoDePessoas.add(pessoa);
            System.out.println("Tem 18 anos, então você pode entrar: "
                    + pessoa.getNome() + " " + " - " +
                    pessoa.getDataNasc());
        }
    }
    public boolean naoTem18Anos(Pessoa pessoa) {
        LocalDate dataAtual = LocalDate.now();
        LocalDate dataAniversario18Anos = pessoa.getDataNasc().plusYears(18);
        return dataAtual.isBefore(dataAniversario18Anos);
    }

    public List<Pessoa> getPessoaList(){
        return grupoDePessoas;
    }
}
