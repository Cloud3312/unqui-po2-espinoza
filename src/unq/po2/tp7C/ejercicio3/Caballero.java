package unq.po2.tp7C.ejercicio3;

public class Caballero implements ICaracter{
	private Integer puntox;
	private Integer puntoy;
	
	public Caballero() {
		this.setPuntoX(0);
		this.setPuntoY(0);
	}

	public Integer getPuntox() {
		return puntox;
	}

	public void setPuntoX(Integer puntox) {
		this.puntox = puntox;
	}

	public Integer getPuntoy() {
		return puntoy;
	}

	public void setPuntoY(Integer puntoy) {
		this.puntoy = puntoy;
	}

	@Override
	public void caminarA(Integer puntoX, Integer puntoY) {
		this.setPuntoX(puntoX);
		this.setPuntoY(puntoY);
	}
}
