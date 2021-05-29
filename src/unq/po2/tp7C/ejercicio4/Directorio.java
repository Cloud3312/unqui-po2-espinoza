package unq.po2.tp7C.ejercicio4;

import java.util.ArrayList;

public class Directorio implements FyleSystem{
	
	private ArrayList<FyleSystem> contenido;
	private String nombre;
	private Integer fechaCreacion;
	
	
	public Directorio (String nombre, Integer fechaCreacion) {
		this.setNombre(nombre);
		this.setFechaCreacion(fechaCreacion);
	}
	public ArrayList<FyleSystem> getContenido() {
		return contenido;
	}


	public void setContenido(ArrayList<FyleSystem> contenido) {
		this.contenido = contenido;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getFechaCreacion() {
		return fechaCreacion;
	}


	public void setFechaCreacion(Integer fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	@Override
	public int totalSize() {
		Integer tamanho = 0;
		for (FyleSystem archivo : this.getContenido()) {
			tamanho += archivo.totalSize();
		}
		return tamanho;
	}


	public void printStructure() {
		for (FyleSystem archivo : this.getContenido()) {
			archivo.printStructure();
		}
	}

	@Override
	public FyleSystem lastModified() {
		return (this.getContenido().get(this.getContenido().size()));
	}

	
	public FyleSystem oldestElement() {
		return (this.getContenido().get(0));
	}
}
	
	

