package unq.po2.tp10.ejercicioCuenta;

public class CuentaCorriente extends CuentaBancaria{
	private Integer limiteDescubierto;
	
	public CuentaCorriente(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo, Integer limiteDescubierto) {
		super(historialDeMovimientos, notificador, saldo);
		this.limiteDescubierto = limiteDescubierto;
	}
	
//	@Override
//	public void extraer(Integer monto) {
//		if(this.saldo + this.limiteDescubierto >= monto)
//			this.saldo = saldo - monto;
//			this.historialDeMovimientos.registrarMovimiento("Extracción", monto);
//			this.notificador.notificarNuevoSaldoACliente(this);
//	}

	@Override
	protected boolean elMontoEsExtraible(Integer monto) {
		return (this.getSaldo() + this.limiteDescubierto >= monto);
	}

}
