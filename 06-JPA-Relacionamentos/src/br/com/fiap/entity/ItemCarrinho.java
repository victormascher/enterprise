package br.com.fiap.entity;

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

@Entity
@Table (name = "T_ITEM_CARRINHO")
@SequenceGenerator(name="sq_item_carrinho", sequenceName= "SQ_T_ITEM_CARRINHO", allocationSize =1)
public class ItemCarrinho {
	
	@Id
	@Column(name= "cd_codigo")
	@GeneratedValue(generator="sq_item_carrinho", strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name= "quantidade")
	private int quantidade;
	
	@Column(name = "vl_valor", nullable = false)
	private double valor;
	
	@ManyToOne 
	@JoinColumn(name= "cd_carrinho")
	private CarrinhoCompras carrinho;
	
	
	@OneToMany(mappedBy= "itemCarrinho")
	@JoinColumn(name="cd_codigo", nullable = false)
	private Produto produto;
	
}
