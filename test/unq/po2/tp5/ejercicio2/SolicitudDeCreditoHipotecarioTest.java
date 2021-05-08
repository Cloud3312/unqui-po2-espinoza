package unq.po2.tp5.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolicitudDeCreditoHipotecarioTest {
	
	private Propiedad propiedad1;
	private Cliente cliente1;
	private SolicitudCreditoHipotecario solicitud1; 
	
	@BeforeEach
	void setUp() throws Exception {
		propiedad1 = new Propiedad("descripcion","direccion",10000);
		cliente1 = new Cliente("Braian", "Espinoza", "Dir 1", 20, 10000,propiedad1);
		solicitud1 = new SolicitudCreditoHipotecario(cliente1, 1000,12);
	}
	
	@Test
	void test001comprobarSiElValorFiscalDeLaCasaEsSuperiorA70PorcientoDelMonto() {
		assertTrue(solicitud1.comprobarSiElValorFiscalDeLaCasaEsSuperiorA70Porciento());
	}
	
	@Test
	void test002comprobarSiLaPersonaEsEsMenorA65Anhos() {
		assertTrue(solicitud1.comprobarSiLaPersonaNoSuperaLos65Anhos());
	}
	
	@Test
	void test003comprobarSiElMontoEsMenorAl50PorcientoDelSueldo() {
		assertTrue(solicitud1.comprobarSiElIngresoNoSuperaEl50Porciento());
	}
	
	@Test
	void test004comprobarSiLaSolicitudEsAceptable() {
		assertTrue(solicitud1.comprobarSiEsAceptable());
	}
	
}
