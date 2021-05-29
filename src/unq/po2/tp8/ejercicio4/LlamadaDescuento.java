package unq.po2.tp8.ejercicio4;

public class LlamadaDescuento extends LlamadaTelefonica{
	
	public LlamadaDescuento(int tiempo, int horaDelDia) {
		super(tiempo, horaDelDia);
	}
	
	//operacion concreta
	@Override
	public boolean esHoraPico() {
		return false;
	}
	
	//operacion hook 
	@Override
	public float costoNeto(){
		return this.getTiempo()*0.95f;
	}
}