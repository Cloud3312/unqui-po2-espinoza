package unq.po2.tp4.ejercicio1;

abstract public class Producto implements Cobrable {
	private Integer stock;
	private Integer precio;
	
	public Producto(Integer stock, Integer precio) {
		this.setStock(stock);
		this.setPrecio(precio);
	}
	
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Integer getPrecio() {
		return precio;
	}
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	
	public void reducirStock() {
		this.setStock(this.getStock() - 1);
	}
	
	public Integer cobrarseEnCaja(Caja caja) {
		if (this.getStock() > 0) {
			this.setStock(this.getStock()-1);
			return(this.calcularCosto());
		}
		else {
			return 0;
		} 
	}
	abstract Integer calcularCosto(); 
}
