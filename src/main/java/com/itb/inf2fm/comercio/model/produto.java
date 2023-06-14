package com.itb.inf2fm.comercio.model;

public class produto {
	
	private Long id;
	private String nome;
	private String descriçao;
	private String codigoBarras;
	private double preco;
	
		// public : Acesso liberado para todas as classes.
		// private: Acesso permtido apenas para os membros da própria classe.
		//			Entende-se por membros(atributos e métodos)
		// setter or getter: atribuir e recuperar dados do atributo respectivamente
		
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescriçao() {
		return descriçao;
	}
	public void setDescriçao(String descriçao) {
		this.descriçao = descriçao;
	}
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
}
