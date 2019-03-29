package br.com.fiap.entity;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Pagamento {
	
	@Id 
	@Column(name="cd_pagamento")
	@GeneratedValue(generator = "sq_pagamento", strategy=GenerationType.SEQUENCE)
	private int cd_pagamento;
	
	@Column(name= "dt_pagamento")
	@Temporal(TemporalType.DATE)
	private Calendar dt_pagamento;
	
	@Column(name= "vl_pagamento")
	private double vl_pagamento;
	
	@Column(name = "ds_forma_pagamento")
	private String ds_forma_pagamento;
	
	
	
	
	
}
