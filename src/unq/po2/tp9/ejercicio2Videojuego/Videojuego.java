package unq.po2.tp9.ejercicio2Videojuego;

public class Videojuego {

	private int fichines;
	private IEstadoDeJuego estadoActual;

	public Videojuego() {
		this.fichines = 0;
		this.estadoActual = new EstadoSinFichas();
	}
	
	public int getFichas() {
		return (this.fichines);
	}
	
	public void setFichas(Integer fichas) {
		this.fichines = fichas;
	}

	public IEstadoDeJuego getEstadoActual() {
		return estadoActual;
	}

	public void setEstadoActual(IEstadoDeJuego estadoActual) {
		this.estadoActual = estadoActual;
	}
	
	public void agregarFicha() {
		this.fichines++;
		if(this.getFichas() == 1) {
			this.setEstadoDeJuego(new EstadoDeUnaFicha());
		} else if (this.getFichas() >= 2) {
			this.setEstadoDeJuego(new EstadoDeDosFichas());
		}
	}

	private void setEstadoDeJuego(IEstadoDeJuego estadoDeJuego) {
		this.estadoActual = estadoDeJuego;
		
	}

	public String iniciar() {
		return this.estadoActual.iniciar(this);
	}
	
	public void gastarFicha() {
		this.fichines--;
	}

	public void terminoElJuego() {
		this.setFichas(0);
		this.setEstadoDeJuego(new EstadoSinFichas());
	}
}
