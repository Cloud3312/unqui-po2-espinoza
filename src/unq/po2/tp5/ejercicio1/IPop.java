package unq.po2.tp5.ejercicio1;

import java.util.List;

public interface IPop {
	public List<Correo> recibirNuevos(ClienteEMail usuario);

	public void conectar(ClienteEMail usuario);

	public void enviar(Correo correo);
}
