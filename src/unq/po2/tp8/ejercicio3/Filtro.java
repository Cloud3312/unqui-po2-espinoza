package unq.po2.tp8.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {
	
	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
		List<WikipediaPage> paginasFiltradas = new ArrayList<WikipediaPage>();
		
		for (WikipediaPage wikipediaPage : wikipedia) {
			this.agregarAListaSiPasaElFiltro(paginasFiltradas, page, wikipediaPage);
		}
		return paginasFiltradas;
	}

	public abstract void agregarAListaSiPasaElFiltro(List<WikipediaPage> paginasFiltradas, 
														WikipediaPage page,WikipediaPage wikipediaPage);
			
	
}	
