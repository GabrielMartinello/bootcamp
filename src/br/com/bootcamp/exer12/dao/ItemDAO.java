package br.com.bootcamp.exer12.dao;

import br.com.bootcamp.exer12.pedido.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemDAO implements ItemDAOUI {

    List<Item> itens = new ArrayList<>();

    @Override
    public List<Item> buscarTodos() {
        return itens;
    }

    @Override
    public Item inserir(Item objeto) {
        for (int i = 0; i < itens.size(); i++) {
                objeto.setId(Long.valueOf(itens.size() + 1));
                itens.add(objeto);
        }
        return null;
    }

    @Override
    public Item atualizar(Item objeto) {
        for (int i = 0; i < itens.size(); i++) {
            if(itens.get(i).getId().equals(objeto.getId())) {
                itens.set(i,objeto);
                return objeto;
            }
        }
        return null;
    }

    @Override
    public void remover(Long id) {
        for (int i = 0; i < itens.size(); i++) {
            if(itens.get(i).getId().equals(id)) {
                itens.remove(i);
                break;
            }
        }
    }
}
