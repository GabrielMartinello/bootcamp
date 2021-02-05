package br.com.bootcamp.exer12.service;

import br.com.bootcamp.exer12.cliente.Cliente;

import java.util.List;

public interface ClienteService {

    List<Cliente> buscarTodos();

    Cliente inserir(Cliente objeto);

    Cliente atualizar(Cliente objeto);

    void remover(Long id);
}
