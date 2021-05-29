package unq.po2.tp7C.ejercicio3;

import java.util.ArrayList;

import unq.po2.tp6.ejercicio1.Carta;

public class Mapa {
	private ArrayList<ICaracter> caracteres;

	public Mapa() {
		ArrayList<ICaracter> caracteres = new ArrayList<ICaracter>();
	}
	
	public ArrayList<ICaracter> getCaracteres(){
		return caracteres;
	}
	
	public void agregarCaracter(ICaracter caracter) {
		this.getCaracteres().add(caracter);
	}
}
