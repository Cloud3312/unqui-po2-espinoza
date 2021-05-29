package unq.po2.tp8.ejercicio4;

public abstract class LlamadaTelefonica {
	private int tiempo;
	private int horaDelDia;
	
	
	public LlamadaTelefonica(int tiempo, int horaDelDia){
		this.tiempo = tiempo;
		this.horaDelDia = horaDelDia;		
	}
	
	public int getTiempo(){
		return this.tiempo;
	}
	
	public int getHoraDelDia(){
		return this.horaDelDia;
	}
	
	public abstract boolean esHoraPico();
	
	// costoFinal es el template method 
	public float costoFinal(){
		if(this.esHoraPico()){	//esHora pico es la primitiva
			return this.costoNeto()*1.2f*this.getTiempo();
		}	
		else{
			return this.costoNeto()*this.getTiempo();
		}
	}
	
	// hook method, ya que tiene un valor predeterminado y la 
	// subclase lo vuelve a definir 
	public float costoNeto(){
		return this.getTiempo()*1;
	}
}