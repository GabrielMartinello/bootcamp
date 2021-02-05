package br.com.bootcamp.exer12.dao;

import br.com.bootcamp.exer12.cliente.Cliente;

import java.util.List;

public interface ClienteDAOUI {

    List<Cliente> buscarTodos();

    Cliente inserir(Cliente objeto);

    Cliente atualizar(Cliente objeto);

    void remover(Long id);

}
