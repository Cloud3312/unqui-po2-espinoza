package unq.po2.tp3.ejercicio6;

public class Punto {
	
	private Integer valorX;
	private Integer valorY;
	
	public Punto(Integer valorDeX, Integer valorDeY) {
		this.setValorX(valorDeX);
		this.setValorY(valorDeY);
	}

	public Punto() {
		this.setValorX(0);
		this.setValorY(0);
	}
	
	public Integer getValorX() {
		return valorX;
	}

	public void setValorX(Integer valorX) {
		this.valorX = valorX;
	}

	public Integer getValorY() {
		return valorY;
	}

	public void setValorY(Integer valorY) {
		this.valorY = valorY;
	}
	
	
	public void moverPuntoA(Integer valorX, Integer valorY) {
		this.setValorX(valorX);
		this.setValorY(valorY);
	}
	
	public void sumarConPunto(Punto p) {
		Integer valorNuevoDeX = this.getValorX() + p.getValorX();
		Integer valorNuevoDeY = this.getValorY() + p.getValorY();
		this.setValorX(valorNuevoDeX);
		this.setValorY(valorNuevoDeY);
	}
	
}
