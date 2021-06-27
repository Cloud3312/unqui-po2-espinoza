package unq.po2.tp10.ejercicioAutomotor;

import java.time.LocalDate;

public class RegistroAutomotor {

	//public Boolean debeRealizarVtv(Vehiculo vehiculo, LocalDate fecha) {

//		LocalDate fechaFabricacion = vehiculo.getFechaFabricacion();
//		Boolean esVehiculoPolicial = vehiculo.esVehiculoPolicial();
//		String ciudadRadicacion = vehiculo.ciudadRadicacion();
//		
//		// vehiculos policiales no realizan vtv, ya que tienen otro tipo de control
//		// s�lo realizan vtv los veh�culos con m�s de 1 anio de antiguedad y radicados
//		// en 'Buenos Aires'
//		return (!esVehiculoPolicial && fecha.minusYears(1).isAfter(fechaFabricacion)
//				&& ciudadRadicacion.equalsIgnoreCase("Buenos Aires"));
		
		//return (!(vehiculo.esVehiculoPolicial()) && vehiculo.puedeAplicarParaVtv(fecha));
		
		
		public Boolean debeRealizarVtv(Vehiculo vehiculo, LocalDate fecha) {

			LocalDate fechaFabricacion = vehiculo.getFechaFabricacion();
			Boolean esVehiculoPolicial = vehiculo.esVehiculoPolicial();
			String ciudadRadicacion = vehiculo.ciudadRadicacion();
			
			// vehiculos policiales no realizan vtv, ya que tienen otro tipo de control
			// s�lo realizan vtv los veh�culos con m�s de 1 anio de antiguedad y radicados
			// en 'Buenos Aires'
			return (!esVehiculoPolicial && fecha.minusYears(1).isAfter(fechaFabricacion)
					&& ciudadRadicacion.equalsIgnoreCase("Buenos Aires"));

		}
} 
