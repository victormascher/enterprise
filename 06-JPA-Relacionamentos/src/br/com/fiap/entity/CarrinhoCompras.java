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
	@Column(name="cd_carrinho_compras")
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

	
	public void addItem(ItemCarrinho item) {
		itemCarrinho.add(item);
		
	}
	
	
	
	
	public CarrinhoCompras(Cliente cliente,double valorT) {
		super();
		this.cliente = cliente;
		this.valorT = valorT;
		
	}

	public CarrinhoCompras() {
		super();
			}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public double getValorT() {
		return valorT;
	}

	public void setValorT(double valorT) {
		this.valorT = valorT;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemCarrinho> getItemCarrinho() {
		return itemCarrinho;
	}

	public void setItemCarrinho(List<ItemCarrinho> itemCarrinho) {
		this.itemCarrinho = itemCarrinho;
	}
	
	
	
	
}
