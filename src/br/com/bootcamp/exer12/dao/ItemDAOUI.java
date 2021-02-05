package br.com.bootcamp.exer12.dao;

import br.com.bootcamp.exer12.pedido.Item;
import br.com.bootcamp.exer12.pedido.Pedido;

import java.util.List;

public interface ItemDAOUI {

    List<Item> buscarTodos();

    Item inserir(Item objeto);

    Item atualizar(Item objeto);

    void remover(Long id);


}
