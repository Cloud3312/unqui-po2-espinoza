package unq.po2.tp5.ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ServidorPop implements IServidor,IPop {

	private ArrayList<ClienteEMail> usuariosRegistrados;
	
	public List<Correo> recibirNuevos(ClienteEMail usuario) {
		List<Correo> retorno = new ArrayList<Correo>();
	  if (this.elUsuarioEstaRegistrado(usuario)) {
		  retorno = usuario.getInbox();
	  }
		return retorno;
	}

	private Boolean elUsuarioEstaRegistrado(ClienteEMail usuario) {
		return this.usuariosRegistrados.contains(usuario);
	}
	
	public void conectar(ClienteEMail usuario) {
		if (this.elUsuarioEstaRegistrado(usuario)) {
			System.out.print("Conectado");
		}
		else {
			System.out.print("El usuario es invalido");
		}
		
	}

	public void enviar(Correo correo) {
      //realiza lo necesario para enviar el correo.		
	}

	@Override
	public float tazaDeTransferencia() {
		//no corresponde
		return 0;
	}

	@Override
	public void resetear() {
         //no corresponde		
	}

	@Override
	public void realizarBackUp() {
		//no corresponde
		
	}



}
