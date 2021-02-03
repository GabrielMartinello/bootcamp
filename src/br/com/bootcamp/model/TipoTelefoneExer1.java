package br.com.bootcamp.model;

public enum TipoTelefoneExer1 {
    COMERCIAL("Comercial"),
    RESIDENCIAL("Residencial"),
    CELULAR("Celular");

    private String descricao;

    TipoTelefoneExer1(String descricao) {
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
