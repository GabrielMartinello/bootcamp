package br.com.bootcamp.exer12.service;

import br.com.bootcamp.exer12.cliente.Cliente;
import br.com.bootcamp.exer12.dao.ClienteDAO;

import java.util.List;

public class ClienteServiceC implements ClienteService {

    private ClienteDAO dao;

    @Override
    public List<Cliente> buscarTodos() {
        return dao.buscarTodos();
    }

    @Override
    public Cliente inserir(Cliente objeto) {
        return dao.inserir(objeto);
    }

    @Override
    public Cliente atualizar(Cliente objeto) {
        return dao.atualizar(objeto);
    }

    @Override
    public void remover(Long id) {
        dao.remover(id);
    }
}
