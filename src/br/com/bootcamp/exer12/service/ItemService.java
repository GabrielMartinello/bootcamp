package br.com.bootcamp.exer12.service;

import br.com.bootcamp.exer12.dao.ItemDAO;
import br.com.bootcamp.exer12.pedido.Item;

import java.util.List;

public class ItemService implements ItemServiceUi{

    private ItemDAO dao;

    @Override
    public List<Item> buscarTodos() {
        return dao.buscarTodos();
    }

//    @Override
//    public Item inserir(Item objeto) {
//        return dao.inserir(objeto);
//    }

    @Override
    public Item atualizar(Item objeto) {
        return dao.atualizar(objeto);
    }

    @Override
    public void remover(Long id) {
        dao.remover(id);
    }
}
