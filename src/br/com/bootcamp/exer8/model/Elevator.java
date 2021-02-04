package br.com.bootcamp.exer8.model;

import br.com.bootcamp.exer8.exceptions.ElevadorDesceException;
import br.com.bootcamp.exer8.exceptions.EntraException;
import br.com.bootcamp.exer8.exceptions.SaiElevadorException;
import br.com.bootcamp.exer8.exceptions.SobeException;

public class Elevator {
    private int numeroAndar;
    private int capacidade;
    private int andarAtual;
    private int numeroPess;

    public Elevator(int numeroAndar, int capacidade) {
        this.numeroAndar = numeroAndar;
        this.capacidade = capacidade;
        this.andarAtual = 0;
        this.numeroPess = 0;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getNumeroPess() {
        return numeroPess;
    }

    public void entra() {
        if((numeroPess + 1) > capacidade){
            throw new EntraException();
        }
        numeroPess += 1;
        System.out.println("Pessoa entrou");
    }

    public void sai() {
        if((numeroPess - 1) <= 0) {
            throw new SaiElevadorException();
        }

        numeroPess -= 1;
        System.out.println("Pessoa sai");
    }

    public void sobe() {
      if(andarAtual == numeroAndar) {
          throw new SobeException();
      }
      andarAtual += 1;
        System.out.println("Subindo");
    }

    public void desce() {
        if(andarAtual == 0) {
            throw new ElevadorDesceException();
        }
        andarAtual -= 1;
        System.out.println("Andar desce");
    }
}
