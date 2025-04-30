package inter;

import java.util.Random;

public abstract class CarroBasico implements Cloneable {
	
	protected String NombreModelo;
	public int precio;
	
	public CarroBasico() {
		
	}

	public String getNombreModelo() {
		return NombreModelo;
	}

	public void setNombreModelo(String nombreModelo) {
		NombreModelo = nombreModelo;
	}

	public int getPrecio() {
		return precio;
	}

	public int setPrecio() {
		int p =0;
		Random r = new Random();
		 p = r.nextInt(10000);
		return p;
	}
	
	public CarroBasico clone() throws CloneNotSupportedException{
		return (CarroBasico) super.clone();
		
	}

	@Override
	public String toString() {
		return "CarroBasico [NombreModelo=" + NombreModelo + ", precio=" + precio + "]";
	}
	
	


}
