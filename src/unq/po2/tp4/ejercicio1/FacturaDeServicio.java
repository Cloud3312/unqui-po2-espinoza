package unq.po2.tp4.ejercicio1;

public class FacturaDeServicio extends Factura{
	private Integer costoPorUnidad;
	private Integer cantidadDeUnidadesConsumidas;
	
	public FacturaDeServicio(Integer costoPorUnidad, Integer cantUnidesConsumidas) {
		this.setCostoPorUnidad(costoPorUnidad);
		this.setCantidadDeUnidadesConsumidas(cantUnidesConsumidas);
	}

	public Integer getCostoPorUnidad() {
		return costoPorUnidad;
	}

	public void setCostoPorUnidad(Integer costoPorUnidad) {
		this.costoPorUnidad = costoPorUnidad;
	}

	public Integer getCantidadDeUnidadesConsumidas() {
		return cantidadDeUnidadesConsumidas;
	}

	public void setCantidadDeUnidadesConsumidas(Integer cantidadDeUnidadesConsumidas) {
		this.cantidadDeUnidadesConsumidas = cantidadDeUnidadesConsumidas;
	}
	
	public Integer calcularCosto() {
		return (this.getCantidadDeUnidadesConsumidas() * this.getCostoPorUnidad());
	}
	
}
