package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

public class Usuario {

	
	@Id
	@Column(name="cd_user")
	@GeneratedValue(generator="sq_user", strategy= GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name = "nm_user")
	private String nome;
	
	@ManyToMany
	@JoinTable(name="T_USUARIO", joinColumns = @JoinColumn(name="cd_user"), 
	inverseJoinColumns = @JoinColumn(name= "cd_teste"))
	private ItemTeste itemTeste;

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
