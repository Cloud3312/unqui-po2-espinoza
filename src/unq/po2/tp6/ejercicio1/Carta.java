package unq.po2.tp6.ejercicio1;

public class Carta {
	private String palo;
	private String numero;
	
	public Carta( String palo,String numero) {
		this.setPalo(palo);
		this.setNumero(numero);
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public Boolean esDelMismoPalo(Carta carta2) { 
		return (this.getPalo() == carta2.getPalo());
	}
	
	public Integer getValorEnNumero() {
		if (this.getNumero().equals("J")) {
			return 10;
		}
		if (this.getNumero().equals("Q")) {
			return 11;
		}
		if (this.getNumero().equals("K")) {
			return 12;
		}
		if (this.getNumero().equals("A")) {
			return 13;
		}
		return (Integer.parseInt(this.getNumero()));
	}
	
	public Boolean laCartaEsSuperiorA(Carta carta2) {
		return (this.getValorEnNumero() > carta2.getValorEnNumero());
	}
}
