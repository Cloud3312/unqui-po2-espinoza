package unq.po2.tp9.Ejercicio1Encriptador1;

public class EncriptadorNave {
	
	private IFormaDeEncriptacion estado; 
	
	public EncriptadorNave(IFormaDeEncriptacion estado) {
		this.setEstadoDeEncriptacion(estado);
	}
	
	public void setEstadoDeEncriptacion (IFormaDeEncriptacion estado) {
		this.estado = estado;
	}
	
	public IFormaDeEncriptacion getEstadoDeEncriptacion() {
		return (this.estado);
	}
	
	public String encriptar (String unaPalabra) {
		return (this.getEstadoDeEncriptacion().encriptar(unaPalabra));
	}
	
	public String desencriptar (String unaPalabra) {
		return (this.getEstadoDeEncriptacion().desencriptar(unaPalabra));
	}
}
