package unq.po2.tp9.ejercicio2Videojuego;

public class EstadoSinFichas implements IEstadoDeJuego {

	@Override
	public String iniciar(Videojuego juego) {

		return ("Por favor, ingrese una ficha para jugar");
	}

}
