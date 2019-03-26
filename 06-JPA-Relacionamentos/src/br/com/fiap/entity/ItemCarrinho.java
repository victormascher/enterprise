package br.com.fiap.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table (name = "T_ITEM_CARRINHO")
@SequenceGenerator(name="sq_item_carrinho", sequenceName= "SQ_T_ITEM_CARRINHO", allocationSize =1)
public class ItemCarrinho {
	
	@Id
	@Column(name= "cd_item_carrinho")
	@GeneratedValue(generator="sq_item_carrinho", strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name= "quantidade")
	private int quantidade;
	
	@Column(name = "vl_valor", nullable = false)
	private double valor;
	
	@ManyToOne 
	@JoinColumn(name= "cd_carrinho")
	private CarrinhoCompras carrinho;
	
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="cd_codigo", nullable = false)
	private Produto produto;


	public ItemCarrinho() {
		super();
		
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public CarrinhoCompras getCarrinho() {
		return carrinho;
	}


	public void setCarrinho(CarrinhoCompras carrinho) {
		this.carrinho = carrinho;
	}


	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
	
	
	
}
