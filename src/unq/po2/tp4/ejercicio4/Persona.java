package unq.po2.tp4.ejercicio4;

import java.time.LocalDate;

public class Persona implements Recorrible{
	
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
}