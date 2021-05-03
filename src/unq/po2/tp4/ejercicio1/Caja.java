package unq.po2.tp4.ejercicio1;

public class Caja implements Agencia{
//	private <Factura>
	private Integer montoImpuesto;
	
	public Caja() {
		this.setMontoImpuesto(0);
	}

	public Integer getMontoImpuesto() {
		return montoImpuesto;
	}

	public void setMontoImpuesto(Integer montoImpuesto) {
		this.montoImpuesto = montoImpuesto;
	}

	public void sumarImpuesto(Integer costoDeImpuesto) {
		setMontoImpuesto(this.getMontoImpuesto() + costoDeImpuesto);
	}
	
	public void registrarPago(Factura factura){
		System.out.println(this.getMontoImpuesto());
		this.setMontoImpuesto(0); // una vez que lo mando a la agencia, lo reseteo para otro cliente
	}
	
	public void cobrarACliente(Cliente cliente) {
		Integer monto = 0;
		for (int i = 0; i < cliente.getCobrables().size(); i++) {
			monto += (cliente.getCobrables().get(i)).cobrarseEnCaja(this);
		}
		informarMontoAPagarAlCliente(cliente, monto);
	}
	
	public void informarMontoAPagarAlCliente(Cliente cliente, Integer monto) {
		cliente.setPrecioAPagar(monto);
	}
}	 
