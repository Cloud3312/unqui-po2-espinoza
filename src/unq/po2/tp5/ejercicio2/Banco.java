package unq.po2.tp5.ejercicio2;

import java.util.ArrayList;

public class Banco {
	private ArrayList<Cliente>clientes;
	private ArrayList<SolicitudDeCredito> solicitudesAprobadas;
	private ArrayList<SolicitudDeCredito> solicitudesPendientes;
	
	public Banco () {
		this.clientes = new ArrayList<Cliente>();
		this.solicitudesAprobadas = new ArrayList<SolicitudDeCredito>();
		this.solicitudesPendientes = new ArrayList<SolicitudDeCredito>();
	}
	
	
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public ArrayList<SolicitudDeCredito> getSolicitudesAprobadas() {
		return solicitudesAprobadas;
	}

	public ArrayList<SolicitudDeCredito> getSolicitudesPendientes() {
		return solicitudesPendientes;
	}

	public void addCliente(Cliente cliente) {
		this.getClientes().add(cliente);
	}
	
	public void registrarSolicitud(SolicitudDeCredito solicitud) {
		this.getSolicitudesPendientes().add(solicitud);
	}

	public void evaluarSolicitud(SolicitudDeCredito solicitud) {
		if (solicitud.comprobarSiEsAceptable()) {
			this.entregarDineroACliente(solicitud.getCliente(), solicitud.getMonto());
			this.getSolicitudesAprobadas().add(solicitud);
		}
	}
	
	public void entregarDineroACliente(Cliente cliente, Integer monto){
		cliente.recibirDineroDelBanco(monto);
	}
	
	public void evaluarSolicitudesPendientes(){
		for (Cliente cliente : this.getClientes()) {
			this.evaluarSolicitud(cliente.getSolicitud());
		}
	}
	
	public Integer calcularSumatoriaDeSolicitudesAprobadas() {
		Integer monto = 0;
		for (SolicitudDeCredito solicitud : this.getSolicitudesAprobadas()) {
			monto += solicitud.getMonto();
		}
		return monto;
	}
	
}
