package main;

import config.ConfigLoader;
import gen.AbstractFactoryLoader;
import inter.UIFactory;
import model.Aplicacion;

public class AbsApp2 {

	public static void main(String[] args) {
		ConfigLoader config = new ConfigLoader("config.properties");
		String tema = config.get("tema");
		
		AbstractFactoryLoader loader = new AbstractFactoryLoader();
		loader.init("compu");
		UIFactory factory = loader.createFactory(tema);
		Aplicacion app = new Aplicacion(factory);
		app.ejecutar();
		
	}
}
