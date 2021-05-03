package unq.po2.tp4.ejercicio1;

import java.util.ArrayList;

public class Cliente {
	private Integer precioAPagar;
	private ArrayList<Cobrable> cobrables;
	
	public Cliente() {
		this.setPrecioAPagar(0);
		this.cobrables = new ArrayList<Cobrable>();
	}
	 
	public Integer getPrecioAPagar() {
		return precioAPagar;
	}
	
	public void setPrecioAPagar(Integer precioAPagar) {
		this.precioAPagar = precioAPagar;
	}
	
	public ArrayList<Cobrable> getCobrables() {
		return cobrables;
	}
	
	public void agregarCobrable(Cobrable cobrable) {
		this.getCobrables().add(cobrable);
	}
}
