package unq.po2.tp6.ejercicio1;

import java.util.ArrayList;

public class PokerStatus {
	
	public ArrayList<Carta> crearMano(Carta carta1, Carta carta2, Carta carta3,
									  Carta carta4, Carta carta5){
		ArrayList<Carta> cartas = new ArrayList<Carta>();
		cartas.add(carta1);
		cartas.add(carta2);
		cartas.add(carta3);
		cartas.add(carta4);
		cartas.add(carta5);
		return cartas;
	}
	

	public String verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		if (this.verificarPoker(carta1, carta2, carta3, carta4, carta5)) {
			return "Poker";
		}
		else if (this.verificarColor(carta1, carta2, carta3, carta4, carta5)){
			return "Color";
		}
		else if (this.verificarTrio(carta1, carta2, carta3, carta4, carta5)){
			return "Trio";
		}
		return "Nada";
	}
	
	// es poker cuando 4 cartas tienen el mismo numero
	public Boolean verificarPoker(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		ArrayList<Carta> cartas = this.crearMano(carta1, carta2, carta3, carta4, carta5);
		return cartas.stream()
				.anyMatch(x -> this.hayPokerDeEn(x, cartas));
	}
	
	
	public Boolean hayPokerDeEn(Carta carta, ArrayList<Carta> cartas) {
		return cartas.stream()
				   .filter(x -> x.getNumero() == carta.getNumero())
				   .count() == 4;
	}
	
	// si hay 5 con el mismo palo 
	public Boolean verificarColor(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		ArrayList<Carta> cartas = this.crearMano(carta1, carta2, carta3, carta4, carta5);
		return cartas.stream()
				.anyMatch(x -> this.hayColorDeEn(x, cartas));
	}

	public boolean hayColorDeEn(Carta carta, ArrayList<Carta> cartas) {
		return cartas.stream() 
					.filter(x -> x.getPalo() == carta.getPalo())
					.count() == 5;
	}
	
	// si hay 3 de un mismo numero
	public Boolean verificarTrio(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		ArrayList<Carta> cartas = this.crearMano(carta1, carta2, carta3, carta4, carta5);
		return cartas.stream()
				.anyMatch(x -> this.hay3DeNumeroDeEn(x, cartas));
	}

	public boolean hay3DeNumeroDeEn(Carta carta, ArrayList<Carta> cartas) {
		return cartas.stream() 
					.filter(x -> x.getNumero() == carta.getNumero())
					.count() == 3;
	}
	
	public Integer puntuacionTotalDeJugada(Jugada jugada1) {
		Integer puntuacion = 0;
		for (Carta carta : jugada1.getJugada()) { 
			puntuacion += carta.getValorEnNumero();
		}
		return puntuacion;
	}
	
	public Jugada ganadorPorValorNumericoEntre(Jugada jugada1, Jugada jugada2) {
	    if (this.puntuacionTotalDeJugada(jugada1) > this.puntuacionTotalDeJugada(jugada2)){
			return jugada1;
		}
	    else {
	    	return jugada2;
	    }
	}
	
	public Jugada ganadorEntre(Jugada jugada1, Jugada jugada2) {
		String resultado1 = this.verificar(jugada1.getJugada().get(0), jugada1.getJugada().get(1), jugada1.getJugada().get(2), 
											jugada1.getJugada().get(3), jugada1.getJugada().get(4));
		String resultado2 = this.verificar(jugada2.getJugada().get(0), jugada2.getJugada().get(1), jugada2.getJugada().get(2), 
											jugada2.getJugada().get(3), jugada2.getJugada().get(4));
		
		if (resultado1.equals("Poker") && !resultado2.equals("Poker")) { 
			return jugada1;
		}
		else if(resultado1.equals("Color") && resultado2.equals("Trio")) { 
			return jugada1;
		}
		else if(resultado1.equals("Trio") && resultado2.equals("Nada")) { 
			return jugada1;
		}
		else {
			return (this.ganadorPorValorNumericoEntre(jugada1, jugada2));
		}
	}
	
}
