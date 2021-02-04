package br.com.bootcamp.exer11;

import br.com.bootcamp.exer10.VendaServiceLmpl;

import java.time.LocalDate;
import java.time.Month;

public class Principal {
    public static void main(String[] args) {

        VendaServiceLmpl vendaService = new VendaServiceLmpl(new VendaDAO());

        vendaService.inserir(new Venda(LocalDate.of(2021, Month.APRIL,1)));
        vendaService.inserir(new Venda(LocalDate.of(2021, Month.APRIL,2)));
        vendaService.inserir(new Venda(LocalDate.of(2021, Month.APRIL,3)));

        vendaService.inserir(new Venda(LocalDate.of(2021, Month.APRIL,4)));
        vendaService.inserir(new Venda(LocalDate.of(2021, Month.APRIL,5)));
        vendaService.inserir(new Venda(LocalDate.of(2021, Month.APRIL,6)));

        vendaService.inserir(new Venda(LocalDate.of(2021, Month.APRIL,7)));
        vendaService.inserir(new Venda(LocalDate.of(2021, Month.APRIL,8)));
        vendaService.inserir(new Venda(LocalDate.of(2021, Month.APRIL,9)));

        LocalDate datainicial = LocalDate.of(2021,Month.AUGUST,8);
        LocalDate dataiFinal = LocalDate.of(2021,Month.AUGUST,9);

        Long totalVendas = vendaService.totalVendas(datainicial,dataiFinal);

        System.out.println("Foram feitas " + totalVendas + "vendas em fevereiro.");

    }
}
