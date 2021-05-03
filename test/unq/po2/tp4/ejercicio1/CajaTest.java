package unq.po2.tp4.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {

	private Cliente cliente1;
	private Cliente cliente2;
	private ProductoPrimeraNecesidad arroz;
	private ProductoEmpresaTradicional asado;
	private FacturaDeImpuesto edesur;
	private FacturaDeServicio disney;
	private FacturaDeServicio netflix;
	private Caja caja1;

	@BeforeEach
	void setUp() throws Exception {
		arroz = new ProductoPrimeraNecesidad(10, 70);
		asado = new ProductoEmpresaTradicional(5,300);
		edesur = new FacturaDeImpuesto(200);
		disney = new FacturaDeServicio(3,100);
		netflix = new FacturaDeServicio(0,100);
		caja1    = new Caja();
		cliente1 = new Cliente();
		cliente2 = new Cliente();
		
		cliente1.agregarCobrable(arroz);
		cliente1.agregarCobrable(disney);
		cliente2.agregarCobrable(netflix);
	}
 
	@Test
	void test1CobrarAClienteUnProductoQueNoEstaEnStock() {
		caja1.cobrarACliente(cliente2);
		assertEquals(0,cliente2.getPrecioAPagar());
	}
   
	@Test
	void test2CobrarAClienteProductoYServicioQueEstanEnStock() {
		caja1.cobrarACliente(cliente1);
		assertEquals(363,cliente1.getPrecioAPagar());
	}
	
	@Test
	void test3CuandoSeCobraUnProductoSeLeReduceUnPuntoDeStock() {
		caja1.cobrarACliente(cliente1);
		assertEquals(9, arroz.getStock());
	}
	
	@Test
	void test4ImpuestoAPagarDeLaCaja1AlCobrarleAlCliente() {
		caja1.cobrarACliente(cliente1);
		assertEquals(300, caja1.getMontoImpuesto());
	}
}
