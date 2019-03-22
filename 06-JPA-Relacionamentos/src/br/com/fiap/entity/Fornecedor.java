package br.com.fiap.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (name = "T_FORNECEDOR")
@SequenceGenerator(name="sq_fornecedor", sequenceName= "SQ_T_FORCENEDOR", allocationSize =1)
public class Fornecedor {
	
	@Id
	@Column(name = "cd_fornecedor")
	@GeneratedValue (generator="sq_fornecedor", strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="nm_nome")
	private String nome;
	
	@Column(name="CNPJ", length = 11)
	private String cnpj;
	
	
	@ManyToMany
	private List<Produto> produto;


	
	
	
	public Fornecedor() {
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


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public List<Produto> getProduto() {
		return produto;
	}


	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	
	
	
	
	
	
}
