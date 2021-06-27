package unq.po2.tp9.ejercicio2Videojuego;

public class EstadoParaUnJugador implements IEstadoDeJuego {

	@Override
	public String iniciar(Videojuego juego) {
		juego.gastarFicha();
		return ("Partida para un jugador");
	}

}
