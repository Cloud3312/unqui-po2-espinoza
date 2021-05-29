package unq.po2.tp7C.ejercicio4;

public class Archivo implements FyleSystem{
	private String nombre;
	private Integer cantEspacio;
	private Integer fechaUltimaModificacion;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getCantEspacio() {
		return cantEspacio;
	}
	public void setCantEspacio(Integer cantEspacio) {
		this.cantEspacio = cantEspacio;
	}
	public Integer getFechaUltimaModificacion() {
		return fechaUltimaModificacion;
	}
	public void setFechaUltimaModificacion(Integer fechaUltimaModificacion) {
		this.fechaUltimaModificacion = fechaUltimaModificacion;
	}
	
	
	public int totalSize() {
		return this.getCantEspacio();
	}
	
	public void printStructure() {
		System.out.println(this.getNombre());
	}
	
	public FyleSystem lastModified() {
		return this;
	}
	
	public FyleSystem oldestElement() {
		// TODO Auto-generated method stub
		return this;
	}

	
	
}
