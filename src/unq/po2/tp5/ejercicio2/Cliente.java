package unq.po2.tp5.ejercicio2;

public class Cliente {
	private String nombre;
	private String apellido;
	private String direccion;
	private Integer edad;
	private Integer sueldoNetoMensual;
	private Propiedad propiedad;
	private Integer credito;
	private SolicitudDeCredito solicitud;
	
	public Cliente(String nombre, String apellido, String direccion,
					Integer edad, Integer sueldoNetoMensual, Propiedad propiedad) {
		
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setDireccion(direccion);
		this.setEdad(edad);
		this.setSueldoNetoMensual(sueldoNetoMensual);
		this.setPropiedad(propiedad);
		this.setCredito(0);
	}

	public SolicitudDeCredito getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(SolicitudDeCredito solicitud) {
		this.solicitud = solicitud;
	}

	public Integer getCredito() {
		return credito;
	}

	public void setCredito(Integer credito) {
		this.credito = credito;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Integer getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}

	public void setSueldoNetoMensual(Integer sueldoNetoMensual) {
		this.sueldoNetoMensual = sueldoNetoMensual;
	}

	public Propiedad getPropiedad() {
		return propiedad;
	}

	public void setPropiedad(Propiedad propiedad) {
		this.propiedad = propiedad;
	}
	
	public Integer getSueldoNetoAnual() {
		return (this.getSueldoNetoMensual()*12);
	}
	
	public void recibirDineroDelBanco(Integer unaCantidad) {
		this.setCredito(this.getCredito() + unaCantidad);
	}
	
	public Integer getValorFiscalDeLaPropiedad() {
		return (this.getPropiedad().getValorFiscal());
	}
}
