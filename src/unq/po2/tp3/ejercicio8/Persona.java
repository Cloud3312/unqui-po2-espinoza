package unq.po2.tp3.ejercicio8;

import java.time.LocalDate;

public class Persona {
	//1- Al objeto cualquiera no le interesa como Persona calcula la edad,
	// solo le interesa el resultado final.A esto se lo llama encapsulamiento
	
	private String nombre;
	private LocalDate fechaNacimiento;
	
	public Persona(String nombre, LocalDate fechaNacimiento) {
		this.setNombre(nombre);
		this.setFechaNacimiento(fechaNacimiento);
	}

	 
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public Integer getEdad() {
		Integer anhoActual = LocalDate.now().getYear();
		return (anhoActual - this.getFechaNacimiento().getYear());
	}
	
	public boolean menorQue(Persona persona) {
		Integer edadDePersonaAComparar = persona.getEdad();
		return (this.getEdad() < edadDePersonaAComparar);
	}
	
	
//	public static void main(String[] args) {
//		LocalDate fecha = LocalDate.of(2000,07,06);
//		Persona persona = new Persona("Braian", fecha);
//		LocalDate fecha2 = LocalDate.of(1998,07,06);
//		Persona persona2 = new Persona("Braian2",fecha2);
		
	public void imprimirFechaDeNacimiento() {
		System.out.println(this.getFechaNacimiento());
	}
//		System.out.println(persona.getFechaNacimiento());

	
//	}
}
