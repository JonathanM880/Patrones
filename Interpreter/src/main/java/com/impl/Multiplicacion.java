package com.impl;

import java.util.Map;
import com.inter.Expresiones;

public class Multiplicacion implements Expresiones {

	private Expresiones izq;
	private Expresiones der;
	
	public Multiplicacion(Expresiones izq, Expresiones der) {
		this.izq = izq;
		this.der = der;
	}
	@Override
	public int interprete(Map<String, Integer> variables) {
		// TODO Auto-generated method stub
		return izq.interprete(variables) * der.interprete(variables);
	}

}

