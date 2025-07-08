package com.impl;

import java.util.Map;

import com.inter.Expresiones;

public class Numero implements Expresiones{

	private int numero;
	
	public Numero(int numero) {
		this.numero = numero;
	}
	@Override
	public int interprete(Map<String, Integer> variables) {
		// TODO Auto-generated method stub
		return numero;
	}

}
