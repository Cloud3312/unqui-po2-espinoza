package unq.po2.tp6.ejercicio1;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;

public class Jugada {
	
	private ArrayList<Carta> cartas;
	
	public Jugada (Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		this.cartas = this.crearJugada(carta1, carta2, carta3, carta4, carta5);
	}

	private ArrayList<Carta> crearJugada(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		ArrayList<Carta> cartas = new ArrayList<Carta>();
		cartas.add(carta1);
		cartas.add(carta2);
		cartas.add(carta3);
		cartas.add(carta4);
		cartas.add(carta5);
		return cartas;
	}
	
	public ArrayList<Carta> getJugada(){
		return this.cartas;
	}
	

	public static void main(String[] args){
//		private Carta carta4P;
//		private Carta carta6P;
//		private Carta carta7P;
//		private Carta carta8P;
//		private Carta carta3P;
//		private Carta carta4C;
//		private Carta carta4T;
//		private Carta carta4D;
//		private Carta carta5T;
//		private Jugada jugada1; // poker
//		private Jugada jugada2; // color
//		private Jugada jugada3; //
//		
		Carta carta4P = new Carta("P","4");
		Carta carta6P = new Carta("P","6");
		Carta carta7P = new Carta("P","7");
		Carta carta8P = new Carta("P","8");
		Carta carta3P = new Carta("P","3");
		Carta carta4C = new Carta("C","4");
		Carta carta4T = new Carta("T","4");
		Carta carta4D = new Carta("D","4");
		Carta carta5T = new Carta("T","5");
		Jugada jugada1 = new Jugada(carta4C,carta4T,carta4D,carta4P,carta3P); //jugada de poker
		Jugada jugada4 = new Jugada(carta4C,carta4T,carta4D,carta4P,carta3P);
		Jugada jugada2 = new Jugada(carta4P,carta6P,carta7P,carta8P,carta3P); //jugada de color
		Jugada jugada3 = new Jugada(carta4P,carta4T,carta4D,carta5T,carta6P); //jugada de trio
		PokerStatus poker = new PokerStatus();
		
//		System.out.println(poker.verificar(carta4P,carta6P,carta7P,carta8P,carta3P) == "Color");
		System.out.println(poker.ganadorEntre(jugada1,jugada2) == jugada2);
	}
}