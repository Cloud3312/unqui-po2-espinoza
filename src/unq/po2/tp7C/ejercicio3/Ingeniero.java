package unq.po2.tp7C.ejercicio3;

public class Ingeniero implements ICaracter{
	private Integer lajas;
	private Integer puntox;
	private Integer puntoy;
	
	public Ingeniero(Integer lajas) {
		this.setLajas(lajas);
		this.setPuntoX(0);
		this.setPuntoY(0);
	}

	
	public Integer getLajas() {
		return lajas;
	}

	public void setLajas(Integer lajas) {
		this.lajas = lajas;
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
	

	public void dejarLaja() {
		this.setLajas(this.getLajas() - 1);
	}


	@Override
	public void caminarA(Integer puntoX, Integer puntoY) {
		while (this.getLajas() == 0){
			this.setLajas(this.getLajas() -1 );
			this.setPuntoX(this.getPuntox() + 1);
			this.setPuntoY(this.getPuntoy() + 1);
		}
		this.setPuntoX(puntoX);
		this.setPuntoY(puntoY);
	}
}
