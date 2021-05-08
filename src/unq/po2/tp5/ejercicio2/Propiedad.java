package unq.po2.tp5.ejercicio2;

public class Propiedad {
	private String descripcion; 
	private String direccion; 
	private Integer valorFiscal;
	
	public Propiedad(String descripcion, String direccion, Integer valorFiscal) {
		this.setDescripcion(descripcion);
		this.setDireccion(direccion);
		this.setValorFiscal(valorFiscal);
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Integer getValorFiscal() {
		return valorFiscal;
	}
	public void setValorFiscal(Integer valorFiscal) {
		this.valorFiscal = valorFiscal;
	}
	
	
}
