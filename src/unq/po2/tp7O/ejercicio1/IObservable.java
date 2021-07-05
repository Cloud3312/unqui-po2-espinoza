package unq.po2.tp7O.ejercicio1;

import java.util.Set;

public interface IObservable {
	
	public void agregarSuscriptor(ISuscriptor observer, Set<String> temaaDeInteres);
	public void quitarSuscriptor(ISuscriptor observer, String temaDeInteres);
	public void notificar(String temaDeArticulo);

}
