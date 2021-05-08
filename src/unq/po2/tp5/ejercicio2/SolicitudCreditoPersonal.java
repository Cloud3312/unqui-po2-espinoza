package unq.po2.tp5.ejercicio2;

public class SolicitudCreditoPersonal extends SolicitudDeCredito{
	
	public SolicitudCreditoPersonal(Cliente cliente, Integer monto, Integer plazo){
		super(cliente, monto, plazo);
	}
	
	public Boolean esIngresoSolicitanteMayorA15K() {
		return (this.getCliente().getSueldoNetoAnual()> 15000);
	}
	
	public Boolean esMontoDeCuotaSuperiorA70Porciento(){
		return (this.getMonto() < this.getCliente().getSueldoNetoMensual()* 0.7);
	}
	
	@Override
	public Boolean comprobarSiEsAceptable() {
	
		return (this.esMontoDeCuotaSuperiorA70Porciento() && 
				this.esIngresoSolicitanteMayorA15K());
	}
	
}
