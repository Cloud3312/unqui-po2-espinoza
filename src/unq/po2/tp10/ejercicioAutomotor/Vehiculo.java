package unq.po2.tp10.ejercicioAutomotor;

import java.time.LocalDate;

// asi queda ahora, al descomentarlo JAVA tira error de class.exception y rompe todos los test
// del eclipse
//public class Vehiculo {
//	private Boolean esVehiculoPolicial;
//	private LocalDate fechaFabricacion;	
//	private String ciudadRadicacion; 
//	
//	public Vehiculo(Boolean esVehiculoPolicial, LocalDate fechaFabricacion, String ciudadRadicacion) {
//		this.esVehiculoPolicial = esVehiculoPolicial;
//		this.fechaFabricacion = fechaFabricacion;
//		this.ciudadRadicacion = ciudadRadicacion;
//	}
//
//	public Boolean esVehiculoPolicial() {
//		return esVehiculoPolicial;
//	}
//
//	public LocalDate getFechaFabricacion() {
//		return fechaFabricacion;
//	}
//
//	public String ciudadRadicacion() {
//		return ciudadRadicacion;
//	}
//	
//	public Boolean puedeAplicarParaVtv(LocalDate fecha) {
//		return this.tieneAntiguedadMayorAUnAño(fecha) &&
//				this.elVehiculoEsDeBuenosAires() &&
//				!(this.esVehiculoPolicial());
//	}
//	
//	private Boolean tieneAntiguedadMayorAUnAño(LocalDate fecha) {
//		return fecha.minusYears(1).isAfter(this.getFechaFabricacion());
//	}
//	
//	private Boolean elVehiculoEsDeBuenosAires() {
//		return this.ciudadRadicacion().equalsIgnoreCase("Buenos Aires");
//	}
//	
//	
//}

//  asi estaba antes 
public class Vehiculo {
	private Boolean esVehiculoPolicial;
	private LocalDate fechaFabricacion;	
	private String ciudadRadicacion; 
	
	public Vehiculo(Boolean esVehiculoPolicial, LocalDate fechaFabricacion, String ciudadRadicacion) {
		this.esVehiculoPolicial = esVehiculoPolicial;
		this.fechaFabricacion = fechaFabricacion;
		this.ciudadRadicacion = ciudadRadicacion;
	}

	public Boolean esVehiculoPolicial() {
		return esVehiculoPolicial;
	}

	public LocalDate getFechaFabricacion() {
		return fechaFabricacion;
	}

	public String ciudadRadicacion() {
		return ciudadRadicacion;
	}
}