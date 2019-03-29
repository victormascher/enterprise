package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Sistema {
	
	
	@Id
	@Column(name="cd_sistema")
	@GeneratedValue(generator = "sq_sistema", strategy = GenerationType.SEQUENCE)
	private int sistema;
	
	@OneToMany(mappedBy= "sistema")
	private CasoTeste caso;
	
	@Column(name= "nm_sistema")
	private String nome;
	

	public Sistema() {
		super();
		
	}

	public int getSistema() {
		return sistema;
	}

	public void setSistema(int sistema) {
		this.sistema = sistema;
	}

	public Sistema(int sistema) {
		super();
		this.sistema = sistema;
	};
	
}
