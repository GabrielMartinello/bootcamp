package br.com.bootcamp.exer10;

import java.util.List;

public interface EspeciesUtil {
    List<Animal> filtrar(List<Animal> animais, Especie especieFiltrar);
    List<Especie>classificar(List<Animal> animais);
}
