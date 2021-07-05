package unq.po2.tp7O.ejercicio2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GestorDePartidos {
	
	private Set<Partido> partidos;
	private Map<String, ArrayList<IObserver>> aspectos;
	// 			interes/deporte  la lista de observers
	
	
	public GestorDePartidos() {
		this.partidos = new HashSet<Partido>();
		this.aspectos = new HashMap<String, ArrayList<IObserver>>();
	}
	
	// el aspecto contaria como un interes del observer 
	public void agregarObserver(IObserver observer, Set<String> intereses) {
		for (String interes : intereses) {
			this.vincularAspectoYObserver(interes, observer);
		}
	}

	//si no esta el aspecto lo crea y le agrega el observer, sino, simplemente le agrega el observer
	private void vincularAspectoYObserver(String aspecto, IObserver observer) {
		if(suscriptoresDelAspecto(aspecto) == null) {
			this.aspectos.put(aspecto, new ArrayList<IObserver>());
		}
		suscriptoresDelAspecto(aspecto).add(observer);
	}
	
	
	// notifica a las keys del map sobre el partido dado
	public void recibirPartido(Partido partido) {
		this.partidos.add(partido);
		for (String aspecto : this.datosDelPartido(partido)) {
			notificar(partido, aspecto);
		}
	}
	
	
	// devuelve la lista de aspectos, o sea, 
	private ArrayList<String> datosDelPartido(Partido partido) {
		ArrayList<String> datosDelPartido = new ArrayList<String>();
		datosDelPartido.add(partido.getDeporte());
		datosDelPartido.addAll(partido.getListaDeContrincantes());
		return datosDelPartido;
	}

	
	private void notificar(Partido partido, String aspectoDePartido) {
		if (elAspectoEstaEnLosAspectosDeInteres(aspectoDePartido)) {
			notificarASuscriptores(suscriptoresDelAspecto(aspectoDePartido), partido);
		}
	}
	
	
	private boolean elAspectoEstaEnLosAspectosDeInteres(String aspectoDePartido) {
		return this.aspectos.containsKey(aspectoDePartido);
	}
	
	private void notificarASuscriptores(ArrayList<IObserver> suscriptores, Partido partido) {
		for (IObserver suscriptor : suscriptores) {
			suscriptor.update(partido);
		}
	}
														//del interes dado
	private ArrayList<IObserver> suscriptoresDelAspecto(String aspecto) {
		return this.aspectos.get(aspecto);
	}

	public Set<Partido> getPartidos() {
		return this.partidos;
	}
}
