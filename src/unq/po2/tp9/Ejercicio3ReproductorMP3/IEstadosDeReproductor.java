package unq.po2.tp9.Ejercicio3ReproductorMP3;

public interface IEstadosDeReproductor {

	public void play(Reproductor reproductor) throws Exception;
	
	public void pause(Reproductor reproductor) throws Exception;
	
	public void stop(Reproductor reproductor);

	public Boolean enReproduccion();
}
