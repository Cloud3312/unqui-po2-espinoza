package unq.po2.tp9.Ejercicio2VideojuegoTestCase;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.po2.tp9.ejercicio2Videojuego.Videojuego;



//	 TIRA ERROR NO ANDAN LOS TEST, SE INICIALIZA EN NULL 
public class VideojuegoTestCase {
	
	private Videojuego videojuego;
	
	@BeforeEach
	void setUp() throws Exception {
		videojuego = new Videojuego();
	}
	
	@Test 
	public void unaMaquinaRecienIniciadaTiene0Fichas() {
		
		assertEquals(0, this.videojuego.getFichas());
	}
	@Test
	void UnJuegoIngresaUnaFichaYTiene1CantidadDeFichas() {
		this.videojuego.agregarFicha();
		assertEquals(1, this.videojuego.getFichas());
	}
	
	@Test
	void unVideojuegoAlIniciarSinFichasMuestraElMensajeIngreseFichasParaJugar() {
		assertEquals("Por favor, ingrese una ficha para jugar", this.videojuego.iniciar());
	}
	
	@Test
	void unVideojuegoIngresaUnaFichaYAlIniciarAhoraMuestraElMensajeComienzaElJuegoParaUnJugador() {
		this.videojuego.agregarFicha();
		assertEquals("Partida para un jugador", this.videojuego.iniciar());
	}
	
	@Test
	void unVideojuegoIngresaDosFichasYAlIniciarMuestraElMensajeComienzaElJuegoParaDosJugadores() {
		this.videojuego.agregarFicha();
		this.videojuego.agregarFicha();
		assertEquals("Partida para dos jugadores", this.videojuego.iniciar());
	}
	
	@Test
	void unVideojuegoJuegoAgregaUnaFichaYLuegoDeIniciarNoTieneFichas() {
		this.videojuego.agregarFicha();
		this.videojuego.iniciar();
		assertEquals(0,this.videojuego.getFichas());
	}
	
	@Test
	void unVideojuegoAlTerminarElJuegoLoSeteaSinFichas() {
		this.videojuego.terminoElJuego();
		assertEquals(0,this.videojuego.getFichas());
	}
	
}
