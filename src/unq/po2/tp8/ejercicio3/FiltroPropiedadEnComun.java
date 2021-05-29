package unq.po2.tp8.ejercicio3;

import java.util.List;

public class FiltroPropiedadEnComun extends Filtro{

	@Override
	public void agregarAListaSiPasaElFiltro(List<WikipediaPage> paginasFiltradas, 
											WikipediaPage page, WikipediaPage wikipediaPage) {
		if(lasPaginasCompartenPropiedadesDeInfobox(page, wikipediaPage)) {
			paginasFiltradas.add(wikipediaPage);
		}
		
	}

	public Boolean lasPaginasCompartenPropiedadesDeInfobox(WikipediaPage page, WikipediaPage wikipediaPage) {
		Boolean result = false;
		for (String key : page.getInfobox().keySet()) {
			result |= wikipediaPage.getInfobox().containsKey(key);
		}
		return result;
	}
}
