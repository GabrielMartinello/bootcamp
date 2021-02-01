package br.com.bootcamp.Exercicio1.Telefones;

public class Telefone {
    private String telefone;
    private TipoTelefone tipoTelefone;

    public Telefone(String telefone, TipoTelefone tipoTelefone)
    {
        this.telefone = telefone;
        this.tipoTelefone = tipoTelefone;
    }

    public TipoTelefone getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(TipoTelefone tipoTelefone) {
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

