package unq.po2.tp9.Ejercicio3ReproductorMP3TestCase;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import unq.po2.tp9.Ejercicio3ReproductorMP3.Reproductor;
import unq.po2.tp9.Ejercicio3ReproductorMP3.Song;

public class ReproductorMP3TestCase {

	private Reproductor reproductor;
	@Mock private Song song1;
	
	@BeforeEach
	public void setUp() {
		this.reproductor = new Reproductor();
		this.song1 = mock(Song.class);
	}
	
	
	@Test
	void unReproductorMP3ReproduceUnaCancion() throws Exception {
		reproductor.agregarAReproduccion(song1);
		reproductor.play();
		verify(song1).play();
	}
	
	@Test
	void unReproductorMP3LanzaErrorAlQuererReproducirCuandoEstaReproduciendo() throws Exception {
		reproductor.agregarAReproduccion(song1);
		reproductor.play();
		assertThrows(Exception.class, () -> reproductor.play());
	}
	
	@Test
	void unReproductorMP3PausaLaCancionLuegoDeReproducirla() throws Exception {
		reproductor.agregarAReproduccion(song1);
		reproductor.play();
		reproductor.pause();
		verify(song1).play();
		verify(song1).pause();
	}
	
	@Test
	void unReproductorMP3LanzaErrorAlQuererReproducirCuandoEstaEnPausa() throws Exception {
		reproductor.agregarAReproduccion(song1);
		reproductor.play();
		reproductor.pause();
		assertThrows(Exception.class, () -> reproductor.play());
		assertFalse(reproductor.enReproduccion());
	}
	
	@Test
	void unReproductorMP3QueEstaEnSeleccionDeCancionLanzaErrorAlQuererPausear() throws Exception {
		reproductor.agregarAReproduccion(song1);
		assertThrows(Exception.class, () -> reproductor.pause());
		assertFalse(reproductor.enReproduccion());
	}
	
	@Test
	void unReproductorMP3PausaLaCancionEnReproduccionYVuelveAReproducirla() throws Exception {
		reproductor.agregarAReproduccion(song1);
		reproductor.play();
		reproductor.pause();
		reproductor.pause();
		assertTrue(reproductor.enReproduccion());
	}
	
	@Test
	void unReproductorMP3EnSeleccionAlPresionarStopNoHaceNada() {
		reproductor.agregarAReproduccion(song1);
		reproductor.stop();
		verifyZeroInteractions(song1);
	}
	
	@Test
	void unReproductorMP3EnReproduccionAlDarStopParaLaCancion() throws Exception {
		reproductor.agregarAReproduccion(song1);
		reproductor.play();
		reproductor.stop();
		verify(song1).stop();
	}
	
	@Test
	void unReproductorMP3AlPararUnaCancionVuelveASeleccionYNoTieneCancionEnReproduccion() throws Exception {
		reproductor.agregarAReproduccion(song1);
		reproductor.play();
		reproductor.stop();
		assertNull(reproductor.getCancionEnReproduccion());
	}
	
	@Test
	void unReproductorMP3AlPararUnaCancionPausadaVuelveASeleccionYNoTieneCancionEnReproduccion() throws Exception {
		reproductor.agregarAReproduccion(song1);
		reproductor.play();
		reproductor.pause();
		reproductor.stop();
		assertNull(reproductor.getCancionEnReproduccion());
	}
	
}

