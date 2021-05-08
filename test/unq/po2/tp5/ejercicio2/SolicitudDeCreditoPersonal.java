package unq.po2.tp5.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolicitudDeCreditoPersonal {

	private Propiedad propiedad1;
	private Cliente cliente1;
	private SolicitudCreditoPersonal solicitud1; 
	
	@BeforeEach
	void setUp() throws Exception {
		propiedad1 = new Propiedad("descripcion","direccion",10000);
		cliente1 = new Cliente("Braian", "Espinoza", "Dir 1", 20, 10000,propiedad1);
		solicitud1 = new SolicitudCreditoPersonal(cliente1, 1000,12);
	}


	@Test
	void test001esIngresoSolicitanteMayorA15K() {
		assertTrue(solicitud1.esIngresoSolicitanteMayorA15K());
	}
	
	@Test
	void test002esMontoDeCuotaSuperiorA70Porciento() {
		assertTrue(solicitud1.esMontoDeCuotaSuperiorA70Porciento());
	}
	
	@Test
	void test003escomprobarSiEsAceptable() {
		assertTrue(solicitud1.comprobarSiEsAceptable());
	}
	
	@Test
	void test004calcularMontoDeLasCuotas() {
		assertEquals(83,solicitud1.calcularMontoDeLasCuotas());
	}
}
