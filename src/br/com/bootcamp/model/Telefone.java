package br.com.bootcamp.model;

public class Telefone {
    private String telefone;
    private TipoTelefoneExer1 tipoTelefone;

    public Telefone(String telefone, TipoTelefoneExer1 tipoTelefone)
    {
        this.telefone = telefone;
        this.tipoTelefone = tipoTelefone;
    }

    public TipoTelefoneExer1 getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(TipoTelefoneExer1 tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        if (tipoTelefone != null) {
            return "Tipo = " + tipoTelefone;
        }
        return "telefone = " + telefone;
    }


}

