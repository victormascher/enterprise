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
	@Column(name = "cd-codigo")
	@GeneratedValue (generator="sq_forncedor", strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="nm_nome")
	private String nome;
	
	@Column(name="CNPJ", length = 11)
	private String cnpj;
	
	
	@ManyToMany
	private List<Produto> produto;
}
