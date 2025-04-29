package com;

import inter.UIFactory;
import model.Aplicacion;
import oscuro.UIFactoryOscuro;
import claro.*;
import config.ConfigLoader;

public class AbsApp {

	public static void main(String[] args) {
		UIFactory factory;
		ConfigLoader config = new ConfigLoader("config.properties");
		String tema = config.get("tema");
		
		if (tema.equals("claro")) {
			factory = new UIFactoryClaro();
		} else {
			factory = new UIFactoryOscuro();
		}
		Aplicacion app = new Aplicacion(factory);
		app.ejecutar();
	}
}
