package unq.po2.tp3.ejercicio8;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {
	private Persona persona1;
	private LocalDate fecha;
	private Persona persona2;
	private LocalDate fecha2;
	
	@BeforeEach
	void setUp() throws Exception {
		this.fecha = LocalDate.of(2000,07,06);
		this.persona1 = new Persona("Braian",this.fecha);
		this.fecha2 = LocalDate.of(1998,07,06);
		this.persona2 = new Persona("Braian2",this.fecha2);
	}

	@Test
	void testEdadDePersona() {
		assertEquals(21,persona1.getEdad());
	}
	
	@Test
	void testPersonaMenorQueOtra() {
		assertTrue(persona1.menorQue(persona2));
	}

}
