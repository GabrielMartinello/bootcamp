package br.com.bootcamp.Exer3;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class GrupoDePessoas {

    private List<Pessoa> grupoDePessoas = new ArrayList<>();
    private LocalDate dataAtual = LocalDate.now();

    public void AdicionaPessoas(Pessoa pessoa) {
        adicionaPessoasMaioresDe18Anos(pessoa);
    }

    private void adicionaPessoasMaioresDe18Anos(Pessoa pessoa) {
        if (verificaSePessoaTem18Anos(pessoa)) {
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

    private boolean verificaSePessoaTem18Anos(Pessoa pessoa) {
        LocalDate dataAniversario18Anos = pessoa.getDataNasc().plusYears(18);
        return dataAtual.isBefore(dataAniversario18Anos);
    }

    public Boolean listaEstavazia() {
        return grupoDePessoas.isEmpty();
    }

    public Integer maiorIdade() {
        retornaMaiorIdade();
        return maiorIdade();
    }

    private void retornaMaiorIdade() {
        if(!listaEstavazia()) {
            Integer maiorIdade = getIdade(grupoDePessoas.get(0).getDataNasc(), dataAtual);
            for (int i = 0; i < grupoDePessoas.size();i++){
                Pessoa pessoaAtual = grupoDePessoas.get(i);
                Integer idade = getIdade(pessoaAtual.getDataNasc(), dataAtual);
                if(idade > maiorIdade) {
                    maiorIdade = idade;
                }
            }
        }else {
            System.out.println("A lista esta vazia");
        }
    }

    public Integer menorIdade(){
        retornaMenorIdade();
        return menorIdade();
    }

    private void retornaMenorIdade() {
        if(!listaEstavazia()) {
            Integer menorIdade = getIdade(grupoDePessoas.get(1).getDataNasc(),dataAtual);
            for (int i = 1;i < grupoDePessoas.size(); i++) {
                Pessoa pessoaAtual = grupoDePessoas.get(1);
                Integer idadeAtual = getIdade(pessoaAtual.getDataNasc(), dataAtual);
                if(idadeAtual < menorIdade){
                    menorIdade = idadeAtual;
                }
            }
        }
    }


    private int getIdade(LocalDate dataNasc, LocalDate dataAtual) {
        return Period.between(dataNasc, dataAtual).getYears();
    }

    public List<Pessoa> getPessoaList(){
        return grupoDePessoas;
    }
}
