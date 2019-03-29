package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class ItemTeste {
	
	@Id
	@Column(name = "cd_teste")
	@GeneratedValue(generator="sq_item", strategy= GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name = "ds_teste")
	private String descricao;

	@ManyToOne
	private CasoTeste casoTeste;
	
	@ManyToMany
	private Usuario user;
	
	
	public ItemTeste(String teste) {
		super();
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTeste() {
		return descricao;
	}

	public void setTeste(String teste) {
		this.descricao = descricao;
	}
	
	
}
