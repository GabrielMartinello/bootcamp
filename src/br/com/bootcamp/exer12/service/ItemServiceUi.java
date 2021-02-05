package br.com.bootcamp.exer12.service;

import br.com.bootcamp.exer12.pedido.Item;

import java.util.List;

public interface ItemServiceUi {
    List<Item> buscarTodos();

//    Item inserir(Item objeto);

    Item atualizar(Item objeto);

    void remover(Long id);


}
