package br.com.bootcamp.exer12.pedido;

import br.com.bootcamp.exer12.cliente.Cliente;
import br.com.bootcamp.exer12.cliente.Endereco;
import br.com.bootcamp.exer12.exceptions.CampoNullException;
import br.com.bootcamp.exer12.exceptions.EhInativoException;
import br.com.bootcamp.exer12.exceptions.ItemException;
import br.com.bootcamp.exer12.vendedor.Vendedor;
import br.com.bootcamp.exer6.BigDecimalUtil;

import java.time.LocalDate;
import java.util.List;

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
    private List<PedidoItem> pedidoItem;
    private Item itens;

    public Pedido(Long id,
                  Cliente cliente,
                  String dataValidade,
                  String dataPrevisao,
                  Endereco endereco,
                  String obs,
                  Vendedor vendedor,
                  LocalDate dataCadastro,
                  FormaDePagamento formaDePagamento) {
        if (cliente == null) {
            throw new CampoNullException("Campo cliente Obrigatorio! ");
        }
        if (vendedor == null) {
            throw new CampoNullException("Campo vendedor Obrigatorio! ");
        }
        if (dataCadastro == null) {
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
    }


    public void insereItens(PedidoItem pedidoItem) {
        if(pedidoItem.getValorUnit() == 0) {
            throw new ItemException();
        }
        if(itens.getSimNao() == 'N') {
            throw new EhInativoException();
        }
         this.pedidoItem.add(pedidoItem);
    }

    public void descontoMaximo(PedidoItem pedidoItem) {
        double desconto = pedidoItem.getValorDesc() + itens.getValorUnitario();
    }

    public String resumo() {
        StringBuilder resumo = new StringBuilder();
        resumo.append("-----------------------------------------------");
        resumo.append("|                     RESUMO                  |");
        resumo.append("-----------------------------------------------");
        resumo.append("--------------- || ------- || ------------");
        resumo.append("Identificador: ").append(cliente.getId());
        resumo.append("Nome: ").append(cliente.getNome());
        resumo.append("CPF: ").append(cliente.getCpf());
        resumo.append("E-mail: ").append(cliente.getEmail());
        resumo.append("--------------- || ------- || ------------");
        resumo.append("Identificador Vendedor: ").append(vendedor.getId());
        resumo.append("Nome do Vendedor: ").append(vendedor.getNome());
        resumo.append("--------------- || ------- || ----------------");
        if(itens != null) {
            resumo.append("--------------- || ------- || ----------------");
            resumo.append("Descricao: ").append(itens.getDescricao());
            resumo.append("Quantidade em estoque: ").append(itens.getQuantidadeEmEstoque());
            resumo.append("Valor Unitário: ").append(itens.getValorUnitario());
            resumo.append("--------------- || ------- || ----------------");
        }
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getDataPrevisao() {
        return dataPrevisao;
    }

    public void setDataPrevisao(String dataPrevisao) {
        this.dataPrevisao = dataPrevisao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

}
