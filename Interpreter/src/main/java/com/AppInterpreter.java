package com;

import java.util.HashMap;
import java.util.Map;

import com.impl.Multiplicacion;
import com.impl.Numero;
import com.impl.Suma;
import com.impl.Variable;
import com.inter.Expresiones;

public class AppInterpreter {

	public static void main(String[] args) {
		Map<String, Integer> variables = new HashMap<String, Integer>();
		variables.put("x", 3);
		variables.put("y", 7);
		variables.put("z", 9);
		
		Expresiones uno = new Suma(new Variable("x"), new Numero(4));
		Expresiones dos = new Multiplicacion(uno, new Variable("y"));

		System.out.println(dos.interprete(variables));
	}
}
