package br.com.bootcamp.exer10;

import java.util.ArrayList;
import java.util.List;

public class ContabilizarEspecies {

    public List<Resultado> getResultados(List<Animal> animals,
                                            EspeciesUtil especiesUtil) {

        List<Resultado> resultados = new ArrayList<>();
        List<Especie> especiesEncontradas = especiesUtil.classificar(animals);

        for (Especie especie : especiesEncontradas) {
            List<Animal> animaisDaEspecie = especiesUtil.filtrar(animals, especie);
            int quantidade = animaisDaEspecie.size();
            resultados.add(new Resultado(especie, quantidade));
        }
        return resultados;
    }

}
