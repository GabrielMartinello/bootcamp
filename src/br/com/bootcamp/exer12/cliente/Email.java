package br.com.bootcamp.exer12.cliente;

import br.com.bootcamp.exer12.exceptions.CampoNullException;

public class Email {

    private String de;
    private String para;
    private String descricao;
    private String conteudo;

    public Email(String de, String para, String descricao, String conteudo) {
        if(de == null) {
            throw new CampoNullException("O campo E-mail é Obrigatório!");
        }
        if(para == null) {
            throw new CampoNullException("O campo 'Para' é obrigatório!");
        }
        this.de = de;
        this.para = para;
        this.descricao = descricao;
        this.conteudo = this.conteudo;
    }

    public String getDe() {
        return de;
    }

    public String getPara() {
        return para;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getConteudo() {
        return conteudo;
    }
}
