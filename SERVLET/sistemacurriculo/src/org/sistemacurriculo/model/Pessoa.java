package org.sistemacurriculo.model;

import java.util.Date;

public class Pessoa {

	private Long id = 1L;
	private String nome;
	private String status;
	private Date dataNascimento;
	
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getData() {
		return dataNascimento;
	}
	public void setData(Date data) {
		this.dataNascimento = data;
	}

}
