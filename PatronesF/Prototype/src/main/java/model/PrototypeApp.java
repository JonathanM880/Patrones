package model;

import impl.Nissan;
import impl.Toyota;
import inter.CarroBasico;

public class PrototypeApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		CarroBasico toyota = new Toyota("ToyotaNuevesito");
		CarroBasico nissan = new Nissan("NiSSAN epiCo");
		
		toyota.precio = 33000;
		nissan.precio = 23120;
		
		CarroBasico toyotaClon = toyota.clone();
		CarroBasico nissanClon = nissan.clone();
		nissanClon.precio = nissanClon.setPrecio();
		
		System.out.println(toyota);
		System.out.println(toyotaClon);
		System.out.println(nissan);
		System.out.println(nissanClon);
		
		
	}
}
