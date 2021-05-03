package unq.po2.tp4.ejercicio1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductosTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad arroz;
	private ProductoEmpresaTradicional asado;
	private ProductoEmpresaTradicional vacio;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad(10, 100);
		arroz = new ProductoPrimeraNecesidad(10, 70);
		asado = new ProductoEmpresaTradicional(5,300);
		vacio = new ProductoEmpresaTradicional(0,400);
	}
	
	// Productos de primera necesidad
	@Test
	public void testCalcularCostoDeProductoDePrimeraNecesidad() {
		assertEquals(90, leche.calcularCosto());
	}
	
//	@Test 
//	public void testReducirElStockEnUnoDelProductoDePrimeraNecesidad() {
//		assertEquals(9, leche.reducirStock());
//	}
	
	//Productos tradicionales 
	@Test
	public void testCalcularCostoTradicional() {
		assertEquals(300, asado.calcularCosto());
	}
	
	@Test
	public void testPrecioDeUnProductoQueNoEstaEnStock(){
		assertEquals(0,vacio.calcularCosto());
	}
	
//	@Test
//	public void testReducirElStockEnUnoDelProductoTradicional() {
//		
//		assertEquals(4, asado.reducirStock());
//	}
}
