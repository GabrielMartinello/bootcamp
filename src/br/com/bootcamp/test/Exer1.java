package br.com.bootcamp.test;

import br.com.bootcamp.exer1.Endereco;
import br.com.bootcamp.exer1.Pessoa;
import br.com.bootcamp.exer1.Telefone;
import br.com.bootcamp.exer1.TipoTelefone;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Exer1 {

    public static void main(String[] a) {
        popularOsAtributos();
    }

    public static void popularOsAtributos() {
        System.out.println("----------------Exer 1--------------");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Debora");
        pessoa.setSobrenome("Mendes");
        pessoa.setCpf("01234567890");
        pessoa.setEmail("debora.mendes@viasoft.com.br");
        pessoa.setDataNascimento(LocalDate.of(1998, Month.MARCH, 8));
        pessoa.setEnderecoList(new ArrayList<>());
        pessoa.getEnderecoList().add(new Endereco("R. Afonso Pena", 1710, "Sambugaro"));
        pessoa.getEnderecoList().add(new Endereco("Av. Tupi", 309, "Centro"));
        pessoa.setTelefoneList(new ArrayList<>());

        Telefone telefone1 = new Telefone();
        telefone1.setTipoTelefone(TipoTelefone.COMERCIAL);
        telefone1.setDdd(46);
        telefone1.setNumero(40072305);
        pessoa.getTelefoneList().add(telefone1);

        Telefone telefone2 = new Telefone();
        telefone2.setDdd(46);
        telefone2.setNumero(40072305);
        pessoa.getTelefoneList().add(telefone2);

        Telefone telefone3 = new Telefone();
        pessoa.getTelefoneList().add(telefone3);

        System.out.println("---------Dados das Pessoas----------");
        pessoa.dadosDaPessoa();
        System.out.println("------------------------------------");
    }

}


