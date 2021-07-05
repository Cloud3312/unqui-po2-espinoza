package unq.po2.tp7O.ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AplicacionMovil implements IObserver {

	private List<String> resultadosObtenidos;
	private List<String> intereses;
	
	public AplicacionMovil() {
		this.resultadosObtenidos = new ArrayList<String>();
		this.intereses = new ArrayList<String>();
	}
	
	public void suscribirseAGestorDePartidosConInteres(GestorDePartidos gestorDePartidos, Set<String> intereses) {
		gestorDePartidos.agregarObserver(this, intereses);
		this.intereses.addAll(intereses);
	}
	
	@Override
	public void update(Partido partido) {
		agregarResultadoDePartido(partido);
		//this.resultadosObtenidos.add(partido.getResultado());
	}

	private void agregarResultadoDePartido(Partido partido) {
		this.resultadosObtenidos.add(partido.getResultado());
	}

	public List<String> getResultadosObtenidos(){
		return this.resultadosObtenidos;
	}
	
}