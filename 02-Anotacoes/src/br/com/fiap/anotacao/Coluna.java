package br.com.fiap.anotacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//mantem a anota��o at� a execu��o
@Target(ElementType.FIELD) //anota��o s� para atributos
public @interface Coluna {

	String nome();
	
	String tipo();
	
	int tamanho() default 255;
	
}