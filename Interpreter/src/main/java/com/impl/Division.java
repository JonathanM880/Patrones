package com.impl;

import java.util.Map;

import com.inter.Expresiones;

public class Division implements Expresiones {

	private Expresiones izq;
	private Expresiones der;
	
	public Division(Expresiones izq, Expresiones der) {
		this.izq = izq;
		this.der = der;
	}
	@Override
	public int interprete(Map<String, Integer> variables) {
		// TODO Auto-generated method stub
		int divisor= der.interprete(variables);
		if(divisor==0) {
			throw new RuntimeException("No se puede dividir para 0");
		}
		return izq.interprete(variables) / der.interprete(variables);
	}

}
