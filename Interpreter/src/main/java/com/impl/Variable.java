package com.impl;

import java.util.Map;

import com.inter.Expresiones;

public class Variable implements Expresiones{

	private String nombre;
	
	public Variable(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public int interprete(Map<String, Integer> variables) {
		// TODO Auto-generated method stub
		return variables.get(nombre);
	}

}
