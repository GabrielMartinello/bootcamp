package br.com.bootcamp.exer10;

import java.util.ArrayList;
import java.util.List;

public class EpeciesUtilLpm implements EspeciesUtil{
    @Override
    public List<Animal> filtrar(List<Animal> animais, Especie especieFiltrar) {
        List<Animal>animaisFiltrar = new ArrayList<>();
        for (Animal animal : animais) {
            if(animal.getEspecie().equals(especieFiltrar)) {
                animaisFiltrar.add(animal);
            }
        }
            return animaisFiltrar;
    }

    @Override
    public List<Especie> classificar(List<Animal> animais) {
        List<Especie> especiesEncontradas = new ArrayList<>();
        for (Animal animal : animais) {
            if (!especiesEncontradas.contains(animal.getEspecie())) {
                especiesEncontradas.add(animal.getEspecie());
            }
        }
        return especiesEncontradas;
    }
}
