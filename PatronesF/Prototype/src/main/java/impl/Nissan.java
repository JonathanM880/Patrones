package impl;

import inter.CarroBasico;

public class Nissan extends CarroBasico{

	public Nissan(String m) {
		this.NombreModelo = m;

	}

	@Override
	public CarroBasico clone() throws CloneNotSupportedException{
		return (Nissan) super.clone();
	}
	
}
