package br.com.bootcamp.exer12.pedido;

import br.com.bootcamp.exer12.cliente.Cliente;
import br.com.bootcamp.exer12.cliente.Endereco;
import br.com.bootcamp.exer12.cliente.Vendedor;
import br.com.bootcamp.exer12.exceptions.CampoNullException;

import java.time.LocalDate;

public class Pedido {
    private Long id;
    private Cliente cliente;
    private String dataValidade;
    private String dataPrevisao;
    private Endereco endereco;
    private String obs;
    private Vendedor vendedor;
    private LocalDate dataCadastro;
    private FormaDePagamento formaDePagamento;
    private Item itens;

    public Pedido(Long id,
                  Cliente cliente,
                  String dataValidade,
                  String dataPrevisao,
                  Endereco endereco,
                  String obs,
                  Vendedor vendedor,
                  LocalDate dataCadastro,
                  Item item,
                  FormaDePagamento formaDePagamento) {
        if(cliente == null){
            throw new CampoNullException("Campo cliente Obrigatorio! ");
        }
        if(vendedor == null){
            throw new CampoNullException("Campo vendedor Obrigatorio! ");
        }
        if(dataCadastro == null){
            throw new CampoNullException("Campo vendedor Obrigatorio! ");
        }
        this.id = id;
        this.cliente = cliente;
        this.dataValidade = dataValidade;
        this.dataPrevisao = dataPrevisao;
        this.endereco = endereco;
        this.obs = obs;
        this.vendedor = vendedor;
        this.dataCadastro = dataCadastro;
        this.formaDePagamento = formaDePagamento;
        this.itens = item;
    }

    public String resumo() {
        StringBuilder resumo = new StringBuilder();
        resumo.append("--------------- || ------- || ------------");
        resumo.append("Identificador: ").append(cliente.getId());
        resumo.append("Nome: ").append(cliente.getNome());
        resumo.append("CPF: ").append(cliente.getCpf());
        resumo.append("E-mail: ").append(cliente.getEmail());
        resumo.append("Identificador Vendedor: ").append(vendedor.getId());
        resumo.append("Nome do Vendedor: ").append(vendedor.getNome());
        if(itens != null) {
            resumo.append("--------------- || ------- || ------------");
            resumo.append("Produtos: ").append(itens.getDescricao());
            resumo.append("Quantidade: ").append(itens.getQuantidadeEmEstoque());
            resumo.append("Valor Unit: ").append(itens.getValorUnitario());
            resumo.append("Inativo: ").append(itens.getSimNao());
            resumo.append("--------------- || ------- || ------------");
        }
        resumo.append("--------------- || ------- || ----------------");
        resumo.append("Data de previsão: ").append(dataPrevisao);
        resumo.append("Data De Validade: ").append(dataValidade);
        resumo.append("Data Cadastro: ").append(dataCadastro);
        resumo.append("Rua: ").append(endereco.getRua());
        resumo.append("Bairro: ").append(endereco.getBairro());
        resumo.append("Número: ").append(endereco.getNumero());
        resumo.append("Fomra de pagamento").append(formaDePagamento);
        resumo.append("--------------- || ------- || ----------------");
        return resumo();
    }
}
