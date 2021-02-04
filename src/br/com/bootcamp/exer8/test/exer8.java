package br.com.bootcamp.exer8.test;

import br.com.bootcamp.exer8.model.Elevator;

public class exer8 {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(3,2);
        elevator.entra();
        elevator.entra();
        elevator.sobe();
        elevator.desce();
        elevator.sobe();
        elevator.sobe();
        elevator.sobe();
        elevator.sobe();
    }
}
