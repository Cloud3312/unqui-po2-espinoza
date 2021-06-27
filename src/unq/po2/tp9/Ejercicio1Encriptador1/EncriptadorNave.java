package unq.po2.tp9.Ejercicio1Encriptador1;

public class EncriptadorNave {
	
	private IEstadoDeEncriptacion estado; 
	
	public EncriptadorNave(IEstadoDeEncriptacion estado) {
		this.setEstadoDeEncriptacion(estado);
	}
	
	public void setEstadoDeEncriptacion (IEstadoDeEncriptacion estado) {
		this.estado = estado;
	}
	
	public IEstadoDeEncriptacion getEstadoDeEncriptacion() {
		return (this.estado);
	}
	
	public String encriptar (String unaPalabra) {
		return (this.getEstadoDeEncriptacion().encriptar(unaPalabra));
	}
	
	public String desencriptar (String unaPalabra) {
		return (this.getEstadoDeEncriptacion().desencriptar(unaPalabra));
	}
}
