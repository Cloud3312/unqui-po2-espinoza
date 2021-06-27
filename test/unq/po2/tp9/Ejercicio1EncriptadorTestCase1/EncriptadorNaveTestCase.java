package unq.po2.tp9.Ejercicio1EncriptadorTestCase1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import unq.po2.tp9.Ejercicio1Encriptador1.EncriptadorDeLetras;
import unq.po2.tp9.Ejercicio1Encriptador1.EncriptadorDeNumeros;
import unq.po2.tp9.Ejercicio1Encriptador1.EncriptadorNave;

public class EncriptadorNaveTestCase {
	private EncriptadorNave encriptador;
	private EncriptadorDeNumeros encriptadorDeNumeros;
	private EncriptadorDeLetras encriptadorDeLetras;
	
	@BeforeEach
	void setUp() throws Exception {
		encriptadorDeNumeros = new EncriptadorDeNumeros();
		encriptadorDeLetras = new EncriptadorDeLetras();
		encriptador = new EncriptadorNave(encriptadorDeNumeros);
	}
	
	//encriptador en modo encriptador de numeros 
	
	
	@Test
	void testEncriptarTestCaseEnModoEncriptadorDeNumeros() {
		String unaPalabra = "Television";
		assertEquals ("20,5,12,5,22,9,19,9,15,14", encriptador.encriptar(unaPalabra));
	
	}
	
	@Test
	void testDesencriptarTestCaseEnModoEncriptadorDeNumeros() {
		String unaPalabra = "4,9,1";
		assertEquals ("Dia", encriptador.desencriptar(unaPalabra));
	
	}
	

	//encriptador en modo encriptador de letras 
	
	@Test
	void testEncriptarTestCaseEnModoEncriptadorDeLetras() {
		encriptador.setEstadoDeEncriptacion(encriptadorDeLetras); 
		String unaPalabra = "Television";
		assertEquals ("Tilivosoun", encriptador.encriptar(unaPalabra));
	
	}
	
	@Test
	void testDesencriptarTestCaseEnModoEncriptadorDeLetras() {
		encriptador.setEstadoDeEncriptacion(encriptadorDeLetras);
		String unaPalabra = "Murcielago";
		assertEquals ("Morcealagi", encriptador.desencriptar(unaPalabra));
	
	}
}
