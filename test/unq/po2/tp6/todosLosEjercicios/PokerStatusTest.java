package unq.po2.tp6.todosLosEjercicios;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import unq.po2.tp6.ejercicio1.Carta;
import unq.po2.tp6.ejercicio1.Jugada;
import unq.po2.tp6.ejercicio1.PokerStatus;

//diamante,pica,corazones,trbol
class PokerStatusTest {
		private Carta carta4P;
		private Carta carta6P;
		private Carta carta7P;
		private Carta carta8P;
		private Carta carta3P;
		private Carta carta4C;
		private Carta carta4T;
		private Carta carta4D;
		private Carta carta5T;
		private Jugada jugada1; // poker
		private Jugada jugada2; // color
		private Jugada jugada3; //
		private PokerStatus pokerStatus;
		

	@BeforeEach
	void setUp() throws Exception {
		carta4P = new Carta("P","4");
		carta6P = new Carta("P","6");
		carta7P = new Carta("P","7");
		carta8P = new Carta("P","8");
		carta3P = new Carta("P","3");
		carta4C = new Carta("C","4");
		carta4T = new Carta("T","4");
		carta4D = new Carta("D","4");
		carta5T = new Carta("T","5");
		jugada1 = new Jugada(carta4C,carta4T,carta4D,carta4P,carta3P); //jugada de poker
		jugada2 = new Jugada(carta4P,carta6P,carta7P,carta8P,carta3P); //jugada de color
		jugada3 = new Jugada(carta4P,carta4T,carta4D,carta5T,carta6P); //jugada de trio
		pokerStatus = new PokerStatus();
	}

	@Test
	public void test001VerificarPokerDeLasCartasDadas() {
		assertTrue(pokerStatus.verificarPoker(carta4C,carta4T,carta4D,carta4P,carta3P));
	}
	
	@Test
	public void test002VerificarColorDeLasCartasDadas() {
		assertTrue(pokerStatus.verificarColor(carta4P,carta6P,carta7P,carta8P,carta3P));
	}
	
	@Test
	public void test003VerificarTrioDeLasCartasDadas() {
		Carta carta5P = mock(Carta.class);
		Carta carta5D = mock(Carta.class);
		Carta carta5C = mock(Carta.class);
		
		when(carta5P.getNumero()).thenReturn("5");  
		when(carta5D.getNumero()).thenReturn("5");
		when(carta5C.getNumero()).thenReturn("5");
		
		assertTrue(pokerStatus.verificarTrio(carta5P,carta5D,carta5C,carta6P,carta8P));
		verify(carta5D,times(1)).getNumero();
	}
	
	@Test
	public void test004PuntuacionTotalDeJugada() {
		assertEquals(19,pokerStatus.puntuacionTotalDeJugada(jugada1));
	}
	
	@Test
	public void test005ganadorPorValorNumericoEntreJugada1Y2RetornaJugada2() {
		assertEquals(jugada2,pokerStatus.ganadorPorValorNumericoEntre(jugada1,jugada2));
	}
	
	@Test
	public void test006ganadorEntreJugadaConPokerYJugadaTrioDevuelveJugada1() {
		Jugada resultado = pokerStatus.ganadorEntre(jugada1,jugada2);
		assertEquals(jugada1,resultado);
	}
	
	@Test
	public void test007ganadorEntreJugadaConTrioYJugadaColorDevuelveJugada2() {
		Jugada resultado = pokerStatus.ganadorEntre(jugada2,jugada3);
		assertEquals(jugada2,resultado);
	}
	
}
