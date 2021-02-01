import java.awt.*;

public enum EnumTeste {
    SOMA("Soma"),
    SUBTRACAO("Subtrção"),
    DIVISAO("Divisao"),
    MULTIPLICACAO("Multiplicação");

    private String descricao;

    EnumTeste(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
