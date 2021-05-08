package unq.po2.tp5.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoTest {
	
	private Propiedad propiedad1;
	private Cliente cliente1;
	private SolicitudCreditoPersonal solicitud1; 
	private Banco banco1;
	
	@BeforeEach
	void setUp() throws Exception {
		propiedad1 = new Propiedad("descripcion","direccion",10000);
		cliente1 = new Cliente("Braian", "Espinoza", "Dir 1", 20, 20000,propiedad1);
		solicitud1 = new SolicitudCreditoPersonal(cliente1, 1000,12);
		banco1 = new Banco();
		banco1.addCliente(cliente1);
	}

	@Test
	void test001CantidadDeClientesEnElBancoAlAgregar1() {
		assertEquals(1,banco1.getClientes().size());
	}
	
	@Test
	void test002CantidadDeSolicitudesAlAgregarUnaSolicitud() {
		banco1.registrarSolicitud(solicitud1);
		assertEquals(1,banco1.getSolicitudesPendientes().size());
	}
	
	@Test  
	void test003evaluaLaSolicitudDadaYPagarleAlCliente() {
		banco1.evaluarSolicitud(solicitud1);
		assertEquals(1000, cliente1.getCredito());
		assertEquals(1, banco1.getSolicitudesAprobadas().size());
	}
	
	@Test
	void test004evaluaLaSolicitudesYVerificarQueSeHayaSumado1ALasAprobadas() {
		banco1.evaluarSolicitudesPendientes();
		assertEquals(1,banco1.getSolicitudesAprobadas().size());
		
	}
	
	@Test
	void test005calcularSumatoriaDeSolicitudesAprobadas() {
		banco1.evaluarSolicitudesPendientes();
		assertEquals(1000,banco1.calcularSumatoriaDeSolicitudesAprobadas());
		
	}
	
}
