package unq.po2.tp6.todosLosEjercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.po2.tp6.ejercicio1.Carta;

class CartaTest {

	private Carta carta4P;
	private Carta carta4C;
	private Carta cartaQD;
	private Carta carta5P;

	
	@BeforeEach
	void setUp() throws Exception {
		carta4P = new Carta("P","4");
		carta4C = new Carta("C","4");
		cartaQD = new Carta("D","Q");
		carta5P = new Carta("P","5");
	}

	@Test
	void test001EsDelMismoPalo() {
		assertTrue(carta4P.esDelMismoPalo(carta5P));
	}
	
	@Test
	void test002getValorEnNumeroDeCartaQ() {
		assertEquals(11,cartaQD.getValorEnNumero());
	}

	@Test
	void test003getValorEnNumeroDeCarta4() {
		assertEquals(4,carta4C.getValorEnNumero());
	}

	@Test
	void test004LaCartaEsSuperiorAUnaCarta() {
		assertTrue(cartaQD.laCartaEsSuperiorA(carta4C));
	}
	
}
