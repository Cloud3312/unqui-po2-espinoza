package unq.po2.tp4.ejercicio1;

abstract public class Factura implements Cobrable{
	
	abstract Integer calcularCosto();
	
	public Integer cobrarseEnCaja(Caja caja) {
		caja.sumarImpuesto(this.calcularCosto());
		return (this.calcularCosto());
	}
	
}
