package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Corrida {
	
	
	@Id
	@Column(name= "cd_corrida")
	@GeneratedValue(generator= "sq_corrida", strategy=GenerationType.SEQUENCE)
	private int cd_corrida;
	
	@Column(name ="ds_origem")
	private String ds_origem;
	
	@Column(name = "ds_destino")
	private String ds_destino;
	
	@Column(name = "dt_corrida")
	@Temporal(TemporalType.DATE)
	private Calendar dt_corrida;
	
	@Column(name = "vl_corrida")
	private double vl_corrida;
	
	
	
	
	
	
	
}
