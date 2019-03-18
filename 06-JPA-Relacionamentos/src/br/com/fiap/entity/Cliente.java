package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private CarrinhoCompras carrinho;
	
	@Id
	@Column(name = "nm_cliente")
	private String nome;
	
	@Id
	@Column(name="CPF", length = 11)
	private String cpf;
}
