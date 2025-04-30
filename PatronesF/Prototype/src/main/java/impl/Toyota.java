package impl;

import inter.CarroBasico;

public class Toyota extends CarroBasico{

	public Toyota(String m) {
		this.NombreModelo = m;
	}

	@Override
	public CarroBasico clone() throws CloneNotSupportedException{
		return (Toyota) super.clone();
	}
	
}
