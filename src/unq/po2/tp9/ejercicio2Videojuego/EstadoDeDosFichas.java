package unq.po2.tp9.ejercicio2Videojuego;

public class EstadoDeDosFichas implements IEstadoDeJuego {

	@Override
	public String iniciar(Videojuego juego) {
		juego.gastarFicha();
		juego.gastarFicha();
		return ("Partida para dos jugadores");
	}

}
