package unq.po2.tp9.ejercicio3ReproductorMP3;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

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
	void test_UnReproductorReproduceUnaCancionSong1() throws Exception {
		reproductor.agregarAReproduccion(song1);
		reproductor.play();
		verify(song1).play();
	}
	
	@Test
	void test_unReproductorLanzaErrorAlQuererReproducirCuandoEstaReproduciendo() throws Exception {
		reproductor.agregarAReproduccion(song1);
		reproductor.play();
		assertThrows(Exception.class, () -> reproductor.play());
	}
	
	@Test
	void test_UnReproductorPausaLaCancionLuegoDeReproducirla() throws Exception {
		reproductor.agregarAReproduccion(song1);
		reproductor.play();
		reproductor.pause();
		verify(song1).play();
		verify(song1).pause();
	}
	
	@Test
	void test_unReproductorLanzaErrorAlQuererReproducirCuandoEstaEnPausa() throws Exception {
		reproductor.agregarAReproduccion(song1);
		reproductor.play();
		reproductor.pause();
		assertThrows(Exception.class, () -> reproductor.play());
		assertFalse(reproductor.enReproduccion());
	}
	
	@Test
	void test_UnReproductorQueEstaEnSeleccionDeCancionLanzaErrorAlQuererPausear() throws Exception {
		reproductor.agregarAReproduccion(song1);
		assertThrows(Exception.class, () -> reproductor.pause());
		assertFalse(reproductor.enReproduccion());
	}
	
	@Test
	void test_UnReproductorPausaLaCancionEnReproduccionYVuelveAReproducirla() throws Exception {
		reproductor.agregarAReproduccion(song1);
		reproductor.play();
		reproductor.pause();
		reproductor.pause();
		assertTrue(reproductor.enReproduccion());
	}
	
	@Test
	void test_unReproductorEnSeleccionAlPresionarStopNoHaceNada() {
		reproductor.agregarAReproduccion(song1);
		reproductor.stop();
		verifyZeroInteractions(song1);
	}
	
	@Test
	void test_unReproductorEnReproduccionAlDarStopParaLaCancion() throws Exception {
		reproductor.agregarAReproduccion(song1);
		reproductor.play();
		reproductor.stop();
		verify(song1).stop();
	}
	
	@Test
	void test_UnReproductorAlPararUnaCancionVuelveASeleccionYNoTieneCancionEnReproduccion() throws Exception {
		reproductor.agregarAReproduccion(song1);
		reproductor.play();
		reproductor.stop();
		assertNull(reproductor.getCancionEnReproduccion());
	}
	
	@Test
	void test_UnReproductorAlPararUnaCancionPausadaVuelveASeleccionYNoTieneCancionEnReproduccion() throws Exception {
		reproductor.agregarAReproduccion(song1);
		reproductor.play();
		reproductor.pause();
		reproductor.stop();
		assertNull(reproductor.getCancionEnReproduccion());
	}
	
}

