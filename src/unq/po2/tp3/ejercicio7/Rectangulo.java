package unq.po2.tp3.ejercicio7;
import unq.po2.tp3.ejercicio6.Punto;

public class Rectangulo {
	
	private Punto esqSupIzquierda;
	private Punto esqSupDerecha;
	private Punto esqInferiorIzquierda;
	private Punto esqInferiorDerecha;
	private Integer alto;
	private Integer ancho;
	
	public Rectangulo(Punto punto, Integer ancho, Integer alto) {
		Punto esqSupIzquierda = (punto);
		Punto esqSupDerecha = new Punto((punto.getValorX() + ancho), punto.getValorY());
		Punto esqInferiorIzquierda = new Punto(punto.getValorX(), (punto.getValorY()-alto));
		Punto esqInferiorDerecha = new Punto((punto.getValorX() + ancho), (punto.getValorY()-alto));
		
		this.setEsqSupIzquierda(esqSupIzquierda);
		this.setEsqSupDerecha(esqSupDerecha);
		this.setEsqSupIzquierda(esqInferiorIzquierda);
		this.setEsqInferiorDerecha(esqInferiorDerecha);
		this.setAncho(ancho);
		this.setAlto(alto);
	}
	
	public Punto getEsqSupIzquierda() {
		return esqSupIzquierda;
	}
	
	public void setEsqSupIzquierda(Punto esqSupIzquierda) {
		this.esqSupIzquierda = esqSupIzquierda;
	}
	
	public Punto getEsqSupDerecha() {
		return esqSupDerecha;
	}
	
	public void setEsqSupDerecha(Punto esqSupDerecha) {
		this.esqSupDerecha = esqSupDerecha;
	}
	
	public Punto getEsqInferiorIzquierda() {
		return esqInferiorIzquierda;
	}
	
	public void setEsqInferiorIzquierda(Punto esqInferiorIzquierda) {
		this.esqInferiorIzquierda = esqInferiorIzquierda;
	}
	
	public Punto getEsqInferiorDerecha() {
		return esqInferiorDerecha;
	}
	
	public void setEsqInferiorDerecha(Punto esqInferiorDerecha) {
		this.esqInferiorDerecha = esqInferiorDerecha;
	}
	
	public Integer getAlto() {
		return alto;
	}
	
	public void setAlto(Integer alto) {
		this.alto = alto;
	}
	
	public Integer getAncho() {
		return ancho;
	}
	
	public void setAncho(Integer ancho) {
		this.ancho = ancho;
	}
	
	public Integer getArea() {
		return (this.getAlto() * this.getAncho());
	}
	
	public Integer getPerimetro() {
		return ((this.getAlto() + this.getAncho())*2);
	}
	
	public String identificarRectangulo() {
		if (this.getAncho() > this.getAlto()) {
			return "Es horizontal";
		}
		else if(this.getAncho() == this.getAlto()){
			return "Es cuadrado";
		}
		else {
			return "Es rectangular";
		}
	}
}





