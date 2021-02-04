package br.com.bootcamp.exer10;

import java.util.List;

public class ContabilizarEspecies {

    public List<Resultado> resultado(List<Animal> animais, EspeciesUtil especiesUtil) {
        List<Especie> especies = especiesUtil.classificar(animais);
        for (int i = 0; i < especies.size(); i++) {
            especies.get(i);
            for(int j = 0; j < animais.size(); j++) {
                especiesUtil.filtrar(animais, especies.get(i));
            }
        }

    return null;

    }
}
