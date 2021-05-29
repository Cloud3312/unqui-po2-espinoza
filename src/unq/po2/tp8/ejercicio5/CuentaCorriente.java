package unq.po2.tp8.ejercicio5;

public class CuentaCorriente extends CuentaBancaria {
	// clase concreta
	 private int descubierto;
	 
	 public CuentaCorriente(String titular, int descubierto){
		 super(titular);
		 this.descubierto = descubierto;
	 }
	 
	 public int getDescubierto(){
		 return this.descubierto;
	 }
	 
//	 @Override
//	 public void extraer(int monto) {
//		 if(this.getSaldo() + this.getDescubierto()>=monto){
//			 this.setSaldo(this.getSaldo()-monto);
//			 this.agregarMovimientos("Extraccion");
//		 }
//	 }

	@Override //este metodo implementa la operacion primitiva
	public boolean condicionDeExtraccion(int monto) {
		return (this.getSaldo() + this.getDescubierto()>=monto);
	}
	 
	 
}