package br.com.bootcamp.exer6;
import java.util.ArrayList;
import java.util.List;

public class Banco implements Imprimivel{
    private List<Conta> contaBancarias = new ArrayList<>();

    public boolean contaExiste(Conta conta) {
        for (int i = 0; i < contaBancarias.size(); i++) {
            return contaBancarias.get(i).getNumeroConta().equals(conta.getNumeroConta());
        }
        return false;
    }

    public void insere(Conta conta) {
        if (!contaExiste(conta)) {
            contaBancarias.add(conta);
            System.out.println("Conta Adicionada!");
        }else {
            System.out.println("Esta Conta já existe!");
        }
    }

    public void remove(Conta conta) {
        boolean removido = contaBancarias.remove(conta);
        System.out.println("Conta: " + conta + " Removida");



        System.out.println(removido ? "Conta removida com sucesso!" : "Conta nao existe");
    }

    public Conta procuraContaNaLista(String numeroConta) {
        for (int i = 0; i < contaBancarias.size(); i++) {
            if(contaBancarias.get(i).getNumeroConta().equals(numeroConta)){
                System.out.println("Conta Encontrada: " +
                        contaBancarias.get(i).getNumeroConta());
                return contaBancarias.get(i);
            }

        }
        return null;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "contaBancarias=" + contaBancarias +
                '}';
    }

    @Override
    public void mostrarDados() {
        for (Conta conta: contaBancarias
             ) {
            System.out.println(contaBancarias.toString());

        }

    }
}
