package br.com.wildrimak.resourceserverspring.api.responses;

import java.util.Date;

public class ExemploResponse {

    private String nome;
    private String descricao;
    private Date dataCriacao;

    public ExemploResponse(String nome, String descricao) {
	this.nome = nome;
	this.descricao = descricao;
	this.dataCriacao = new Date();
    }

    public String getNome() {
	return nome;
    }

    public String getDescricao() {
	return descricao;
    }

    public Date getDataCriacao() {
	return dataCriacao;
    }
}