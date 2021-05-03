package unq.po2.tp4.ejercicio1;

public class ProductoPrimeraNecesidad extends Producto{
	
	public ProductoPrimeraNecesidad(Integer stock, Integer precio) {
		super(stock,precio);
	}
	
	public Integer calcularCosto() {
		Integer descuento = ((this.getPrecio() * 10)/100);
		if (this.getStock() > 0) {
			return (this.getPrecio() - descuento);
		}
		else {
			return 0;
		}	
	}
} 
