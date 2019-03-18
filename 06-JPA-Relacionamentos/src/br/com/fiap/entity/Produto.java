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
	@Column(name = "cd_codigo")
	@GeneratedValue(generator ="sq_produto", strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@OneToMany(mappedBy = "produto")
	@JoinColumn(name = "cd_codigo", nullable = false)
	private List<ItemCarrinho> itemCarrinho;
	
	@Column(name ="nm_nome")
	private String nome;
	
	@Column(name = "vl_valor")
	private double valor;
	
	@ManyToMany
	private List<Fornecedor> Forncedor;
	
}
