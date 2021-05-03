package unq.po2.tp4.ejercicio1;

public class ProductoEmpresaTradicional extends Producto{
	
	public ProductoEmpresaTradicional(Integer stock, Integer precio) {
		super(stock, precio);
	}

	public Integer calcularCosto() {
		if (this.getStock() > 0) {
			return(this.getPrecio());
		}
		else {
			return 0;
		}		 
	}	
	
}
