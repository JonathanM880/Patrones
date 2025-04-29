package oscuro;

import anotacion.Tema;
import inter.Boton;
import inter.UIFactory;
import inter.Ventana;

@Tema("oscuro")
public class UIFactoryOscuro implements UIFactory {

	@Override
	public Boton crearBoton() {
		// TODO Auto-generated method stub
		return new BotonOscuro();
	}

	@Override
	public Ventana crearVentana() {
		// TODO Auto-generated method stub
		return new VentanaOscura();
	}

}
