package br.com.fiap.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class CasoTeste {
	
	
	@Id
	@Column(name= "cd_caso")
	@GeneratedValue(generator= "sq_caso", strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name ="nm_caso")
	private String nome;
	
	@ManyToOne
	private Sistema sistema;
	
	@OneToMany(mappedBy= "casoTeste")
	private List<ItemTeste> itemTeste;
	
	
	@Column(name= "ds_caso")
	private String descricao;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public CasoTeste() {
		super();
		
	}

	public CasoTeste(String nome, String descricao) {
		super();
		this.nome = nome;
		this.descricao = descricao;
	}
	
	
	
}
