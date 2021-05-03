package unq.po2.tp4.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteTest {
	private Cliente cliente1;
	private ProductoPrimeraNecesidad arroz;
	private ProductoEmpresaTradicional asado;
	private FacturaDeImpuesto edesur;
	private FacturaDeServicio disney;

	@BeforeEach
	void setUp() throws Exception {
		arroz = new ProductoPrimeraNecesidad(10, 70);
		asado = new ProductoEmpresaTradicional(5,300);
		edesur = new FacturaDeImpuesto(200);
		disney = new FacturaDeServicio(3,100);
		cliente1 = new Cliente();
		
		cliente1.agregarCobrable(arroz);
		cliente1.agregarCobrable(asado);
		cliente1.agregarCobrable(edesur);
		cliente1.agregarCobrable(disney);
	} 

	@Test 
	void testCantidadDeCobrablesDelCliente() {
		assertEquals(4, cliente1.getCobrables().size());
	}

	
}
