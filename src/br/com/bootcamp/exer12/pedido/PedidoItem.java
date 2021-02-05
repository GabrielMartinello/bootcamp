package br.com.bootcamp.exer12.pedido;

public class PedidoItem {
    private Long id;
    private Item item;
    private Double quantidade;
    private Double valorUnit;
    private Double valorDesc;

    public PedidoItem(Long id,
                      Item item,
                      Double quantidade,
                      Double valorUnit,
                      Double valorDesc) {
        this.id = id;
        this.item = item;
        this.quantidade = quantidade;
        this.valorUnit = valorUnit;
        this.valorDesc = valorDesc;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorUnit() {
        return valorUnit;
    }

    public void setValorUnit(Double valorUnit) {
        this.valorUnit = valorUnit;
    }

    public Double getValorDesc() {
        return valorDesc;
    }

    public void setValorDesc(Double valorDesc) {
        this.valorDesc = valorDesc;
    }

    public void getVlrTotal() {
        Double total = (quantidade * valorUnit) - valorDesc;
    }

    public void getVkrSemDesc() {
        Double total = (quantidade * valorUnit);
    }

    public Long getId() {
        return id;
    }
}
