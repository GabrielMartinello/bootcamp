package br.com.bootcamp.exer12.dao;

import br.com.bootcamp.exer12.cliente.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements ClienteDAOUI{

    List<Cliente> clientes = new ArrayList<>();

    @Override
    public List<Cliente> buscarTodos() {
        return clientes;
    }

    @Override
    public Cliente inserir(Cliente objeto) {
        objeto.setId(Long.valueOf(clientes.size() + 1));
        clientes.add(objeto);
        return objeto;
    }

    @Override
    public Cliente atualizar(Cliente objeto) {
        for (int i = 0; i < clientes.size(); i++) {
            if(clientes.get(i).getId().equals(objeto.getId())) {
                clientes.set(i,objeto);
                return objeto;
            }
        }
        return null;
    }

    @Override
    public void remover(Long id) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId().equals(id)) {
                clientes.remove(i);
                break;
            }
        }
    }
}
