package unq.po2.tp3.ejercicio9;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	
	private String nombreEquipo;
	private ArrayList<Persona> integrantes;
	
	public EquipoDeTrabajo(String nombreEquipo) {
		this.setNombreEquipo(nombreEquipo);
		this.integrantes = new ArrayList<Persona>();
	}
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	
	public ArrayList<Persona> getIntegrantes() {
		return integrantes;
	}
	
	public void agregarIntegrante(Persona integranteAAgregar) {
		this.getIntegrantes().add(integranteAAgregar);
	}
	
	public Integer getEdadPromedioDeIntegrantes() {
		Integer edadPromedio = 0;
		for (Persona integrante : this.getIntegrantes()) {
			edadPromedio += integrante.getEdad();
		}
		return (edadPromedio/ this.getIntegrantes().size());

	}
	
	
	
//	public static void main(String[] args) {
//		Persona persona  = new Persona("Braian","espinoza", 20);
//		Persona persona1 = new Persona("Miguel","Rodriguez", 20);
//		Persona persona2 = new Persona("Luis","Suarez", 20);
//		Persona persona3 = new Persona("Roberto", "Martinez", 20);
//		Persona persona4 = new Persona("Alfredo","Fernandez", 20);
//		EquipoDeTrabajo equipo = new EquipoDeTrabajo("Microsoft");
//		
//		equipo.agregarIntegrante(persona);
//		equipo.agregarIntegrante(persona1);
//		equipo.agregarIntegrante(persona2);
//		equipo.agregarIntegrante(persona3);
//		equipo.agregarIntegrante(persona4);
//		
//		System.out.println(equipo.getEdadPromedioDeIntegrantes());
//	}
}
