package unq.po2.tp8.ejercicio7;

import javax.swing.DefaultListModel;

public class OrdenatedWordList extends DefaultListModel {
	ListaDePalabrasOrdenadas lista = new ListaDePalabrasOrdenadas();
	
	public void addElement(String palabra) {
		lista.agregarPalabra(palabra);
	}
	
	public int getSize() {
		return this.lista.cantidadDePalabras();
	}
	
	public String getElementAt(int index) {
		return this.lista.getPalabraDePosicion(index);
	}
}