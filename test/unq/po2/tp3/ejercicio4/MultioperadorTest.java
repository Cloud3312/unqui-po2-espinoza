package unq.po2.tp3.ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTest {
	
	private Multioperador multioperador;
	
	@BeforeEach
	void setUp() throws Exception {
		this.multioperador = new Multioperador();
		this.multioperador.agregarNumero(2);
		this.multioperador.agregarNumero(5);
		this.multioperador.agregarNumero(10);
		this.multioperador.agregarNumero(5);
	}

	@Test
	void testSumarNumeros() {
		assertEquals(22, multioperador.sumarNumeros());
	}

	@Test
	void testRestarNumeros() {
		assertEquals(-22, multioperador.restarNumeros());
	}
	
	@Test
	void testMultiplicarNumeros() {
		assertEquals(500, multioperador.multiplicarNumeros());
	}
	
}
