package unq.po2.tp9.ejercicio2Videojuego;

public class Videojuego {

	private Integer fichas;
	private IEstadoDeJuego estadoActual;

	public void VideoJuego() {
		this.fichas = 0;
		this.estadoActual = new EstadoSinFichas();
	}
	
	public Integer getFichas() {
		return (this.fichas);
	}

	public void setFichas(Integer fichas) {
		this.fichas = fichas;
	}

	public IEstadoDeJuego getEstadoActual() {
		return estadoActual;
	}

	public void setEstadoActual(IEstadoDeJuego estadoActual) {
		this.estadoActual = estadoActual;
	}
	
	public void agregarFicha() {
		this.fichas++;
		if(this.getFichas() == 1) {
			this.setEstadoDeJuego(new EstadoParaUnJugador());
		} else if (this.getFichas() >= 2) {
			this.setEstadoDeJuego(new EstadoParaDosJugadores());
		}
	}

	private void setEstadoDeJuego(IEstadoDeJuego estadoDeJuego) {
		this.estadoActual = estadoDeJuego;
		
	}

	public String iniciar() {
		return this.estadoActual.iniciar(this);
	}
	
	public void gastarFicha() {
		this.fichas--;
	}

	public void terminoElJuego() {
		this.setEstadoDeJuego(new EstadoSinFichas());
	}
}
