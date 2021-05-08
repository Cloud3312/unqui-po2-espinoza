package unq.po2.tp5.ejercicio2;

public abstract class SolicitudDeCredito {
	private Cliente cliente;
	private Integer monto;
	private Integer plazo;
	
	public SolicitudDeCredito(Cliente cliente, Integer monto, Integer plazo) {
		this.setCliente(cliente);
		this.setMonto(monto);
		this.setPlazo(plazo);
		cliente.setSolicitud(this);
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Integer getMonto() {
		return monto;
	}
	public void setMonto(Integer monto) {
		this.monto = monto;
	}
	public Integer getPlazo() {
		return plazo;
	}
	public void setPlazo(Integer plazo) {
		this.plazo = plazo;
	}
	
	public Integer calcularMontoDeLasCuotas() {
		return (this.getMonto() / this.getPlazo());
	}
	
	abstract Boolean comprobarSiEsAceptable(); 
}
