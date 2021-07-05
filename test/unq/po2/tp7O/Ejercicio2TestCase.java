package unq.po2.tp7O;

import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import unq.po2.tp7O.ejercicio2.AplicacionMovil;
import unq.po2.tp7O.ejercicio2.GestorDePartidos;
import unq.po2.tp7O.ejercicio2.Partido;
import unq.po2.tp7O.ejercicio2.ServidorDeportivo;


class GestorDePartidosTest {
	
	private GestorDePartidos gestor;
	private Partido partido;
	private Partido otroPartido;
	private ServidorDeportivo servidor;
	private AplicacionMovil aplicacion;
	
	@BeforeEach
	public void setUp() {
		this.gestor = new GestorDePartidos();
		this.partido = new Partido("Gana Federer", List.of("Federer", "Nadal"), "Tenis");
		this.otroPartido = new Partido("Gana River 3 - 1", List.of("River", "Boca"), "Futbol");
		this.servidor = new ServidorDeportivo();
		this.aplicacion = new AplicacionMovil();
		
	}

	@Test
	void test_UnServidorRecibeInformacionTenis() {
		servidor.suscribirseAGestorDeportivo(gestor, Set.of("Tenis"));
		gestor.recibirPartido(partido);
		assertTrue(servidor.getPartidosRecibidos().contains(partido));
	}
	
	
	@Test
	void test_UnServidorSeSuscribeConInteresFedererYRecibeUnPartido() {
		servidor.suscribirseAGestorDeportivo(gestor, Set.of("Futbol"));
		gestor.recibirPartido(partido);
		assertFalse(servidor.getPartidosRecibidos().contains(partido));
	}
	
	
	@Test
	void test_unServidorSeSuscribeConInteresEnDeporteFutbolYNoRecibeNingunaNotificacion() {
		servidor.suscribirseAGestorDeportivo(gestor, Set.of("Futbol", "Tenis"));
		gestor.recibirPartido(partido);
		assertTrue(servidor.getPartidosRecibidos().contains(partido));
	}
	
	
	@Test
	void test_unServidorSeSuscribeATenisYNadalYRecibeUnPartidoConEsosAspectos() {
		servidor.suscribirseAGestorDeportivo(gestor, Set.of("Futbol", "Tenis"));
		gestor.recibirPartido(partido);
		gestor.recibirPartido(otroPartido);
		assertTrue(servidor.getPartidosRecibidos().contains(partido));
		assertTrue(servidor.getPartidosRecibidos().contains(otroPartido));
		assertEquals(2, servidor.getPartidosRecibidos().size());
	}
	
	@Test
	void test_unaAplicacionNoSeSuscribeANingunGestorPorLoTantoTiene0ResultadosRecibidos() {
		Integer cantidadDeResultados = this.aplicacion.getResultadosObtenidos().size();
		assertEquals(0, cantidadDeResultados);
	}
	
	@Test
	void test_unaAplicacionSeSuscribeConElInteresFedererYRecibeUnResultado() {
		this.aplicacion.suscribirseAGestorDePartidosConInteres(gestor, Set.of("Federer"));
		this.gestor.recibirPartido(partido);
		Integer cantidadDeResultados = this.aplicacion.getResultadosObtenidos().size();
		assertEquals(1, cantidadDeResultados);
	}
	
	@Test
	void test_unaAplicacionSeSuscribeConElInteresFedererYRiverYRecibeUnDosResultados() {
		this.aplicacion.suscribirseAGestorDePartidosConInteres(gestor, Set.of("Federer", "River"));
		this.gestor.recibirPartido(partido);
		this.gestor.recibirPartido(otroPartido);
		Integer cantidadDeResultados = this.aplicacion.getResultadosObtenidos().size();
		assertEquals(2, cantidadDeResultados);
	}

}
