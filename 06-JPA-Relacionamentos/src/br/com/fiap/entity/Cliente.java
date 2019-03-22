package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (name = "T_CLIENTE")
@SequenceGenerator(name="sq_cliente", sequenceName= "SQ_T_CLIENTE", allocationSize =1)
public class Cliente {
	
	
	@Id
	@Column(name="cd_cliente")
	@GeneratedValue(generator = "sq_cliente", strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@OneToOne(mappedBy = "cliente")
	//@JoinColumn(name="cd_carrinho")
	private CarrinhoCompras carrinho;
	

	@Column(name = "nm_cliente")
	private String nome;
	

	@Column(name="CPF", length = 11)
	private String cpf;

	public Cliente() {
		super();
		
	}
	
	
	
	public Cliente(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}



	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public CarrinhoCompras getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(CarrinhoCompras carrinho) {
		this.carrinho = carrinho;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	
}



