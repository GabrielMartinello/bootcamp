package br.com.bootcamp.exer12.dao;

import br.com.bootcamp.exer12.pedido.Pedido;

import java.util.ArrayList;
import java.util.List;

public class PedidoDAO implements PedidoDAOUI {

    List<Pedido> pedidos = new ArrayList<>();

    @Override
    public List<Pedido> buscarTodos() {
        return pedidos;
    }

//    @Override
//    public Pedido inserir(Pedido objeto) {
//        objeto.setId(Long.valueOf(pedidos.size()) + 1);
//        pedidos.add(objeto);
//        return objeto;
//    }

    @Override
    public Pedido atualizar(Pedido objeto) {
        for (int i = 0; i < pedidos.size(); i++) {
            if (pedidos.get(i).getId().equals(objeto.getId())) ;
            pedidos.set(i, objeto);
            return objeto;
        }
        return null;
    }

    @Override
    public void remover(Long id) {
        for (int i = 0; i < pedidos.size(); i++) {
            if (pedidos.get(i).getId().equals(id)) {
                pedidos.remove(i);
                break;
            }
        }
    }
}
