package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ValueGenerationType;

public class Motorista {
	
	@Id
	@GeneratedValue(generator =  "sq_carteira", strategy=GenerationType.SEQUENCE)
	@Column(name = "nr_carreira")
	private int nr_carteira;
	
	@Column(name= "nm_motorista")
	private String nm_motorista;
	
	@Column(name = "dt_nascimento")
	private Calendar dt_nascimento;
	
	@Column(name = "fl_carteira")
	private byte[] fl_carteira;
	
	@Column(name = "ds_genero")
	private String ds_genero;
	
	
	
	
	
}
