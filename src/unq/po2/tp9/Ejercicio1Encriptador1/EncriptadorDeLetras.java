package unq.po2.tp9.Ejercicio1Encriptador1;

public class EncriptadorDeLetras implements IFormaDeEncriptacion{
	
	@Override
	public String encriptar(String unaPalabra) {
		unaPalabra = unaPalabra.replace("u", "a")
							   .replace("o", "u")
							   .replace("i", "o")
							   .replace("e", "i")
							   .replace("a", "e");
		return unaPalabra;
	}
	
	@Override
	public String desencriptar(String unaPalabra) {
		unaPalabra = unaPalabra.replace("e", "a")
							   .replace("i", "e")
							   .replace("o", "i")
							   .replace("u", "o")
							   .replace("u", "a");
		return unaPalabra;
	}

}
