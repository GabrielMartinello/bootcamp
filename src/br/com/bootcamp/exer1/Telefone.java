package br.com.bootcamp.exer1;

public class Telefone {

    private TipoTelefone tipoTelefone;
    private Integer ddd;
    private Integer numero;

    public Telefone() {

    }

    public TipoTelefone getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(TipoTelefone tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public Integer getDdd() {
        return ddd;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        if (tipoTelefone != null) {
            return tipoTelefone.getDescricao() + ": " + "(" + ddd + ")" + numero;
        }
        return tipoTelefone + ": " + "(" + ddd + ")" + numero;
    }
}

