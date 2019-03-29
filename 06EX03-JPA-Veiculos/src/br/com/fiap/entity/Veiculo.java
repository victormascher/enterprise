package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Veiculo {
	
	@Id
	@Column(name ="cd_veiculo" )
	@GeneratedValue(generator= "sq_veiculo", strategy=GenerationType.SEQUENCE)
	private int cd_veiculo;
	
	
	@Column(name = "ds_placa")
	private String ds_placa;
	
	
	@Column(name ="ds_cor")
	private String ds_cor;
	
	
	@Column(name= "nr_ano")
	private int nr_ano;
	
	
	
	
	
}
