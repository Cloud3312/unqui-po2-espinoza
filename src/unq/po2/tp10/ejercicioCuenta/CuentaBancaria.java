package unq.po2.tp10.ejercicioCuenta;

public abstract class CuentaBancaria {
	private  HistorialMovimientos historialDeMovimientos;
	private  Notificador notificador;
	private  int saldo;
	
	public CuentaBancaria(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo) {
		super();
		this.historialDeMovimientos = historialDeMovimientos;
		this.notificador = notificador;
		this.saldo = saldo;
	}

	public int getSaldo() {
		return saldo;
	}
	
	public  void extraer(Integer monto) {;
		if(this.elMontoEsExtraible(monto)) {
			this.saldo -=monto;
			this.historialDeMovimientos.registrarMovimiento("Extraccion", monto);
			this.notificador.notificarNuevoSaldoACliente(this);
		}
	}

	protected abstract boolean elMontoEsExtraible(Integer monto);
}
