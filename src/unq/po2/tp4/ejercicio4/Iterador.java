package unq.po2.tp4.ejercicio4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Iterador {
	private ArrayList<Recorrible> recorribles;
	
	public Iterador(){
		this.recorribles = new ArrayList<Recorrible>();
	}
	
	
	
	public void agregarRecorrible(Recorrible recorrible) {
		this.getRecorribles().add(recorrible);
	}

	public ArrayList<Recorrible> getRecorribles(){
		return recorribles;
	}

	public void setRecorribles(ArrayList<Recorrible> recorribles) {
		this.recorribles = recorribles;
	}
	
	public void getNombreDeLosRecorribles(){
		ArrayList<String> nombres = new ArrayList<String>();
		
		for (Recorrible recorrible : this.getRecorribles()) {
			nombres.add(recorrible.getNombre());
		}
		System.out.println(nombres);
	}
	
	
	
	//Ejemplo 
	public static void main(String[] args) {
		LocalDate fecha = LocalDate.of(2000,07,06);
		Persona persona = new Persona("Braian", fecha);
		LocalDate fecha2 = LocalDate.of(1998,07,06);
		Persona persona2 = new Persona("Braian2",fecha2);
		Mascota mascota1 = new Mascota("Nieve", "Husky");
		Iterador iterador1 =  new Iterador();
		
		iterador1.agregarRecorrible(mascota1);
		iterador1.agregarRecorrible(persona);
		iterador1.agregarRecorrible(persona2);
		
		iterador1.getNombreDeLosRecorribles();
	}
	
	
	//Punto 4, en smalltalk no es necesario ya que no se tienen que declarar los tipos,
	//mientras que en java la unica forma de hacerlo es a traves de una interface.
	
	//Punto 5, se debe hacer a traves de una interfaz.
}
