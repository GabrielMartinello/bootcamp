package br.com.bootcamp.exer12.service;

import br.com.bootcamp.exer12.pedido.Pedido;

import java.util.List;

public interface PedidoService {

    List<Pedido> buscarTodos();

    Pedido inserir(Pedido objeto);

    Pedido atualizar(Pedido objeto);

    void remover(Long id);

}
