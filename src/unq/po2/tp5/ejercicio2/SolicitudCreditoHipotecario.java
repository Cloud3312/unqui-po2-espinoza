package unq.po2.tp5.ejercicio2;

public class SolicitudCreditoHipotecario extends SolicitudDeCredito {
	
	private Propiedad propiedadDeCliente;
	public SolicitudCreditoHipotecario(Cliente cliente, Integer monto, Integer plazo){
		super(cliente,monto, plazo);
		this.setPropiedadDeCliente(this.getCliente().getPropiedad());
	}
	
	public Propiedad getPropiedadDeCliente() {
		return propiedadDeCliente;
	}

	public void setPropiedadDeCliente(Propiedad propiedadDeCliente) {
		this.propiedadDeCliente = propiedadDeCliente;
	}
	
	public Boolean comprobarSiElValorFiscalDeLaCasaEsSuperiorA70Porciento() {
		return ((this.getPropiedadDeCliente().getValorFiscal()* 0.7) > this.getMonto());
	}
	
	public Boolean comprobarSiLaPersonaNoSuperaLos65Anhos() {
		return (this.getCliente().getEdad() < 65);
	}
	
	public Boolean comprobarSiElIngresoNoSuperaEl50Porciento() {
		return ((this.getCliente().getSueldoNetoMensual() *0.5) > this.getMonto());
	}
	
	@Override
	public Boolean comprobarSiEsAceptable() {
		return (this.comprobarSiElIngresoNoSuperaEl50Porciento() &&
				this.comprobarSiElValorFiscalDeLaCasaEsSuperiorA70Porciento() &&
				this.comprobarSiLaPersonaNoSuperaLos65Anhos());
	}
	
	
}
