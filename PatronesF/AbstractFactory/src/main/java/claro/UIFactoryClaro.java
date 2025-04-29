package claro;

import anotacion.Tema;
import inter.Boton;
import inter.UIFactory;
import inter.Ventana;

@Tema("claro")
public class UIFactoryClaro implements UIFactory{

	@Override
	public Boton crearBoton() {
		// TODO Auto-generated method stub
		return new BotonClaro();
	}

	@Override
	public Ventana crearVentana() {
		// TODO Auto-generated method stub
		return new VentanaClara();
	}

}
