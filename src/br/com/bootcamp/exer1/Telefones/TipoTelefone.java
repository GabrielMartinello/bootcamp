package br.com.bootcamp.exer1.Telefones;

public enum TipoTelefone {
    COMERCIAL("Comercial"),
    RESIDENCIAL("Residencial"),
    CELULAR("Celular");

    private String descricao;

    TipoTelefone(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "TipoTelefone" +
                "/ndescricao = " + descricao;
    }
}
