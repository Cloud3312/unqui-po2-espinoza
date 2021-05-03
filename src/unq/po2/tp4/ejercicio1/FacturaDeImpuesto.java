package unq.po2.tp4.ejercicio1;

public class FacturaDeImpuesto extends Factura{

	private Integer costo;

	public FacturaDeImpuesto(Integer costo) {
		this.setCosto(costo);
	}

	public Integer getCosto() {
		return costo;
	}

	public void setCosto(Integer costo) {
		this.costo = costo;
	}

	Integer calcularCosto() {
		return (this.getCosto());
	}

}
