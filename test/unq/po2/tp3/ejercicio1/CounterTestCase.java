package unq.po2.tp3.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTestCase {
	private Counter counter;
	
	@BeforeEach
	void setUp() throws Exception {
		counter = new Counter();
		counter.agregarUnNumero(1); 
		counter.agregarUnNumero(5);
		counter.agregarUnNumero(7);
		counter.agregarUnNumero(9);
		counter.agregarUnNumero(1);
		counter.agregarUnNumero(1);
		counter.agregarUnNumero(1); 
		counter.agregarUnNumero(1);
		counter.agregarUnNumero(4);
	}

	@Test
	public void testChequeoDePares() {
//		int cantidad = counter.getNumerosPares();
		assertEquals(1,counter.getNumerosPares());
	}
	
	@Test
	public void testChequeoDeImpares() {
		assertEquals(8,counter.getNumerosImpares());
	}
	
	@Test 
	public void testChequeoDeMultiplosDe() {
		assertEquals(1, counter.getMultiplosDe(9));
	}

//	@Test 
//	public void testeo() {
//		String a = "abc";
//		String s = a;
//		String t;
//		
//		assertEquals(2,a.substring(1,3).equals("bc"));
//	}
}
