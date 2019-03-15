package br.com.fiap.anotacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) //anota��o para classe e interface
@Retention(RetentionPolicy.RUNTIME)
public @interface Tabela {

	String nome();
	
}