package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Passageiro {
	
	@Id 
	@Column(name = "cd_passageiro")
	@GeneratedValue(generator= "sq_passageiro", strategy=GenerationType.SEQUENCE)
	private int cd_passageiro;
	
	@Column(name= "nm_passageiro")
	private String nm_passageiro;
	
	
	@Column(name ="dt_nascimento")
	@Temporal(TemporalType.DATE)
	private Calendar dt_nascimento;
	
	@Column(name= "ds_genero")
	private String ds_genero;
	
	
	
	
	
}
