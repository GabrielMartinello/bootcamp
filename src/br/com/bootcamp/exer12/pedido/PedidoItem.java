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
