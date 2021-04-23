package unq.po2.tp3.ejercicio9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTest {

	private EquipoDeTrabajo equipo;
	private Persona persona;
	private Persona persona1;
	private Persona persona2;
	private Persona persona3;
	private Persona persona4;

	@BeforeEach
	public void setUp() throws Exception {
		this.persona  = new Persona("Braian","espinoza", 20);
		this.persona1 = new Persona("Miguel","Rodriguez", 20);
		this.persona2 = new Persona("Luis","Suarez", 20);
		this.persona3 = new Persona("Roberto", "Martinez", 20);
		this.persona4 = new Persona("Alfredo","Fernandez", 20);
		this.equipo = new EquipoDeTrabajo("Microsoft");
		
		equipo.agregarIntegrante(persona);
		equipo.agregarIntegrante(persona1);
		equipo.agregarIntegrante(persona2);
		equipo.agregarIntegrante(persona3);
		equipo.agregarIntegrante(persona4);
	}

	@Test
	public void testGetPromedioEdadDeIntegrantes(){
		assertEquals(20, this.equipo.getEdadPromedioDeIntegrantes());
	}

}
