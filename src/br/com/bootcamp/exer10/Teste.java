package br.com.bootcamp.exer10;

import br.com.bootcamp.exer10.aves.Coruja;
import br.com.bootcamp.exer10.mamiferos.Cachorro;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        ContabilizarEspecies contabilizarEspecies = new ContabilizarEspecies();
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cachorro(Especie.MAMIFEROS, "Lecter"));
        animals.add(new Cachorro(Especie.MAMIFEROS, "Tobi"));
        animals.add(new Coruja(Especie.AVES, "MidNight"));

        List<Resultado> resultados = contabilizarEspecies.getResultados(animals,
                new EpeciesUtilLpm()
        );

        for (Resultado resultado : resultados) {
            System.out.println(resultado);
        }

    }

}
