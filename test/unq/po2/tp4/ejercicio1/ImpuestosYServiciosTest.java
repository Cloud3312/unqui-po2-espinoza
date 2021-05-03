package unq.po2.tp4.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ImpuestosYServiciosTest {

	private FacturaDeImpuesto edesur;
	private FacturaDeServicio disney;
	
	@BeforeEach
	void setUp() throws Exception {
		edesur = new FacturaDeImpuesto(200);
		disney = new FacturaDeServicio(3,100);
	}

	@Test
	void testCalcularCostoDeLaFacturaDeImpuesto() {
		assertEquals(200, edesur.calcularCosto());
	}
 
	@Test
	void testCalcularCostoDeLaFacturaDeServicio() {
		assertEquals(300, disney.calcularCosto());
	}
}
