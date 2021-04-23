package unq.po2.tp3.ejercicio4;

import java.util.ArrayList;

public class Multioperador {
	
	private  ArrayList<Integer> numeros;
	
	public Multioperador(){
		this.numeros = new ArrayList<Integer>();
	}
	
	public ArrayList<Integer> getNumeros(){
		return this.numeros;
	}
	
	public void agregarNumero(Integer unNumero) {
		this.getNumeros().add(unNumero);
	}
	
	public Integer sumarNumeros() {
		Integer numerosSumados = 0;
		for (Integer numero : this.getNumeros()) {
			numerosSumados += numero;
		}
		return numerosSumados;
	}
	
	
	public Integer restarNumeros() {
		Integer resultado = 0;
		for (Integer numero : this.getNumeros()) {
			resultado -= numero;
		}
		return resultado;
	}
	
	
	public Integer multiplicarNumeros() {
		Integer resultado = 1;
		for (Integer numero : this.getNumeros()) {
			resultado *= numero;
		}
		return resultado;
	}
}
