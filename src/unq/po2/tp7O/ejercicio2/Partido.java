package unq.po2.tp7O.ejercicio2;
import java.util.List;

public class Partido {
	
	private String resultado;
	private List<String> nombresDeContrincantes;
	private String deporte;
	
	public Partido(String resultado, List<String> nombresDeContrincantes, String deporte) {
		this.resultado = resultado;
		this.nombresDeContrincantes = nombresDeContrincantes;
		this.deporte = deporte;
	}

	public List<String> getListaDeContrincantes() {
		return this.nombresDeContrincantes;
	}
	
	public String getDeporte() {
		return this.deporte;
	}
	
	public String getResultado() {
		return this.resultado;
	}

}

