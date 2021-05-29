package unq.po2.tp7C.ejercicio2;

import java.util.ArrayList;

public class RegionSubdividida implements ICultivo{

	private ArrayList<ICultivo> cultivos;

	public ArrayList<ICultivo> getCultivos() {
		return cultivos;
	}

	public void setCultivos(ArrayList<ICultivo> cultivos) {
		this.cultivos = cultivos;
	}

	
	public Integer determinarGananciaAnual() {
		Integer gananciaHastaAhora = 0;
		for (ICultivo cultivo : this.getCultivos()) {
			gananciaHastaAhora += cultivo.determinarGananciaAnual();
		}
		return gananciaHastaAhora/4;
	}
	
	public void agregarCultivo(ICultivo cultivo) {
		this.cultivos.add(cultivo);
	}
	
	public void removerCultivo(ICultivo cultivo) {
		this.cultivos.remove(cultivo);
	}
}
