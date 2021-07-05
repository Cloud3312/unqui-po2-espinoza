package unq.po2.tp8.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public abstract class CuentaBancaria {
	 private String titular;
	 private int saldo;
	 private List<String> movimientos;
	 
	public CuentaBancaria(String titular){
		 this.titular=titular;
		 this.saldo=0;
		 this.movimientos=new ArrayList<String>();
	}
	 
	public String getTitular(){
		return this.titular;
	}
	 
	public int getSaldo(){
		return this.saldo;
	}
	 
	protected void setSaldo(int monto){
		this.saldo=monto;
	}
	 
	public void agregarMovimientos(String movimiento){
		this.movimientos.add(movimiento);
	}
	 
	public void extraer(int monto) {	// template method/esqueleto
		if(this.condicionDeExtraccion(monto)){	//metodo primitivo definido como abstracto
			 this.setSaldo(this.getSaldo()-monto); //metodos concretos 
			 this.agregarMovimientos("Extraccion");
		 }
	}
	
	public abstract boolean condicionDeExtraccion(int monto); 
		
}
