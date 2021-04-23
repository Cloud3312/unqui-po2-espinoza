package unq.po2.tp3.ejercicio1;

import java.util.ArrayList;

public class Counter {
	private ArrayList<Integer> numeros;
	
	public Counter(){
		this.numeros = new ArrayList<Integer>();
	}
	
	public void agregarUnNumero(Integer unNumero) {
		this.numeros.add(unNumero);
	}
	
	public Integer getNumerosPares(){
		Integer paresHastaAhora = 0;
		for (Integer numero : this.numeros) {
			paresHastaAhora += unoSiEsPar(numero);
		}
		return paresHastaAhora;
	}  
	
	public Integer unoSiEsPar(Integer unNumero) {
		if (esPar(unNumero)) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public boolean esPar(Integer unNumero) {
		return (unNumero%2 == 0);
	}
	
	public Integer getNumerosImpares(){
		Integer imparesHastaAhora = 0;
		for (Integer numero : this.numeros) {
			imparesHastaAhora += unoSiEsImpar(numero);
		}
		return imparesHastaAhora;
	}
	
	public Integer unoSiEsImpar(Integer unNumero) {
		if (esImpar(unNumero)) {
			return 1; 
		}
		else {
			return 0;
		}
	}
	
	public boolean esImpar(Integer unNumero) {
		return (unNumero%2 >= 1);
	}
	
	public Integer getMultiplosDe(Integer unNumero) {
		Integer cantidadMultiplos = 0;
		for (Integer numero : this.numeros) {
			cantidadMultiplos += unoSiEsMultiplo(numero, unNumero);
		}
		return cantidadMultiplos;
	}
	
	public Integer unoSiEsMultiplo(Integer unNumero, Integer otroNumero) {
		if (esMultiplo(unNumero, otroNumero)) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public boolean esMultiplo(Integer unNumero,Integer otroNumero) {
		return (unNumero % otroNumero == 0);
	}
}
