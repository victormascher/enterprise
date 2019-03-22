package br.com.fiap.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (name = "T_PRODUTO")
@SequenceGenerator(name="sq_produto", sequenceName= "SQ_T_PRODUTO", allocationSize =1)
public class Produto {
	
	@Id
	@Column(name = "cd_produto")
	@GeneratedValue(generator ="sq_produto", strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@OneToMany(mappedBy = "produto")
	private List<ItemCarrinho> itemCarrinho;
	
	@Column(name ="nm_nome")
	private String nome;
	
	@Column(name = "vl_valor")
	private double valor;
	
	@ManyToMany
	private List<Fornecedor> Forncedor;

	
	
	
	
	
	
	public Produto() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public List<ItemCarrinho> getItemCarrinho() {
		return itemCarrinho;
	}

	public void setItemCarrinho(List<ItemCarrinho> itemCarrinho) {
		this.itemCarrinho = itemCarrinho;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public List<Fornecedor> getForncedor() {
		return Forncedor;
	}

	public void setForncedor(List<Fornecedor> forncedor) {
		Forncedor = forncedor;
	}
	
	
	
}
