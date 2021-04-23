package unq.po2.tp3.ejercicio6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PuntoTest {
	
	private Punto punto;
	private Punto punto2;
	private Punto punto3;
	
	@BeforeEach
	void setUp() throws Exception {
		this.punto  = new Punto(2, 3);
		this.punto2 = new Punto(); 
		this.punto3 = new Punto(2,2);
	}

	@Test
	void testPuntoInicializado() {
		assertEquals(2, this.punto.getValorX());
		assertEquals(3, this.punto.getValorY());
		assertEquals(0, this.punto2.getValorX());
		assertEquals(0, this.punto2.getValorY());
	}
	
	@Test
	void testMoverPuntoAOtraPosicion(){
		assertEquals(2, this.punto.getValorX());
		assertEquals(3, this.punto.getValorY());
	    this.punto.moverPuntoA(4, 6);
	    assertEquals(4, this.punto.getValorX());
	    assertEquals(6, this.punto.getValorY());
	}
	
	@Test
	void testSumarPunto(){
		assertEquals(2, this.punto.getValorX());
		assertEquals(3, this.punto.getValorY());
	    this.punto.sumarConPunto(punto3);
	    assertEquals(4, this.punto.getValorX());
	    assertEquals(5, this.punto.getValorY());
	}

}
