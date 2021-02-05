package br.com.bootcamp.exer11;

import br.com.bootcamp.exer11.Venda;
import br.com.bootcamp.exer11.VendaDAO;
import br.com.bootcamp.exer11.VendaService;

import java.time.LocalDate;
import java.util.List;

public class VendaServiceLmpl implements VendaService {

    private final VendaDAO dao;

    public VendaServiceLmpl(VendaDAO dao) {
        this.dao = dao;
    }

    @Override
    public List<Venda> buscarTodos() {
        return dao.buscarTodos();
    }

    @Override
    public Venda buscarPorId(Long id) {
        return dao.buscar(id);
    }

    @Override
    public Venda inserir(Venda objeto) {
        return dao.inserir(objeto);
    }

    @Override
    public Venda alterar(Venda objeto) {
        return dao.alterar(objeto);
    }

    @Override
    public void excluir(Long id) {
        dao.excluir(id);
    }

    @Override
    public Long totalVendas(LocalDate dataInicial, LocalDate dataFinal) {
        return dao.totalVendas(dataInicial, dataFinal);
    }
}
