package unq.po2.tp5.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteTest {

	private Propiedad propiedad1;
	private Cliente cliente1;
	
	@BeforeEach
	void setUp() throws Exception {
		propiedad1 = new Propiedad("descripcion","direccion",10000);
		cliente1 = new Cliente("Braian", "Espinoza", "Dir 1", 20, 10000,propiedad1);
	}
	
	@Test
	void test001CalcularSueldoNetoAnual() {
		assertEquals(120000,cliente1.getSueldoNetoAnual());
	}

	@Test
	void test002RecibirCreditoDelBanco() {
		cliente1.recibirDineroDelBanco(1000);
		assertEquals(1000,cliente1.getCredito());
	}

	@Test
	void test003ObtenerValorFiscalDeLaPropiedad(){
		assertEquals(10000, cliente1.getValorFiscalDeLaPropiedad());
	}
}
