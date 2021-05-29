package unq.po2.tp8.ejercicio5;

public class CajaDeAhorro extends CuentaBancaria {
	//clase concreta
	 private int limite;
	 
	 public CajaDeAhorro(String titular, int limite){
		 super(titular);
		 this.limite = limite;
	 }
	 
	 public int getLimite(){
		 return this.limite;
	 }
	 
//	 @Override
//	 public void extraer(int monto) {
//		 if(this.getSaldo()>=monto && this.getLimite()>=monto){
//			 this.setSaldo(this.getSaldo()-monto);
//			 this.agregarMovimientos("Extraccion");
//		 }
//	 }
	 
	 @Override  //este metodo implementa la operacion primitiva
	public boolean condicionDeExtraccion(int monto) {
		return(this.getSaldo()>=monto && this.getLimite()>=monto);
	}
}