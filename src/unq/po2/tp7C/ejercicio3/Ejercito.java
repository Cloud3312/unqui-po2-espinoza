package unq.po2.tp7C.ejercicio3;

import java.util.ArrayList;

public class Ejercito implements ICaracter {
	
	private ArrayList<ICaracter> caracteres;
	
	public ArrayList<ICaracter> getCaracteres() {
		return caracteres;
	}

	public void setCaracteres(ArrayList<ICaracter> caracteres) {
		this.caracteres = caracteres;
	}
	
	public void caminarA(Integer puntoX, Integer puntoY) {
		for(ICaracter caracter : this.getCaracteres()) {
			caracter.caminarA(puntoX, puntoY);
		}
	}
	
	public void agregarICaracter(ICaracter caracter) {
		this.getCaracteres().add(caracter);
	}
	
	public void removerICaracter(ICaracter caracter) {
		this.getCaracteres().remove(caracter);
	}
}
