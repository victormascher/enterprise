package br.com.fiap.entity;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;


@Entity
@Table (name = "T_CARRINHO_COMPRAS")
@SequenceGenerator(name="sq_carrinho_compras", sequenceName= "SQ_T_CARRINHO_COMPRAS", allocationSize =1)
public class CarrinhoCompras {
	
	@Id
	@Column(name="cd_codigo")
	@GeneratedValue (generator = "sq_carrinho_compras", strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	@Column(name ="dt_carrinho")
	private Calendar data;
	
	@Column(name= "vl_valor", nullable = false)
	private double valorT;
	
	@OneToOne
	@JoinColumn(name = "cd_cliente" , nullable = false)
	private Cliente cliente;
	
	@OneToMany(mappedBy="carrinho")
	private List<ItemCarrinho> itemCarrinho;
	
}
