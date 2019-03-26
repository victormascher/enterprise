package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Usuario {

	
	@Id
	@Column(name="cd_user")
	@GeneratedValue(generator="sq_user", strategy= GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name = "nm_user")
	private String nome;

	public Usuario(String nome) {
		super();
		this.nome = nome;
	}

	public Usuario() {
		super();
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
