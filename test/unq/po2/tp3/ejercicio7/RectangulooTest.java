package unq.po2.tp3.ejercicio7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.po2.tp3.ejercicio6.Punto;

class RectangulooTest {
	

	private Rectangulo rectangulo;
	private Punto punto;
	
	@BeforeEach
	void setUp() throws Exception {
		this.punto = new Punto(5,6);
		this.rectangulo = new Rectangulo(punto, 10,7);
	}

	@Test
	void testAreaDelRectangulo() {
		assertEquals(70, this.rectangulo.getArea());
	}
	
	@Test
	void testPerimetroDelRectangulo() {
		assertEquals(34, this.rectangulo.getPerimetro());
	}
	
	@Test 
	void testIdentificarRectangulo() {
		assertEquals("Es horizontal", this.rectangulo.identificarRectangulo());
	}
	
	
}
