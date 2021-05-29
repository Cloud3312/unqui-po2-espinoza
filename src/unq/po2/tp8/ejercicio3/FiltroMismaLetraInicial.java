package unq.po2.tp8.ejercicio3;

import java.util.List;

public class FiltroMismaLetraInicial extends Filtro {
	
	public void agregarAListaSiPasaElFiltro(List<WikipediaPage> paginasFiltradas, 
										WikipediaPage page, WikipediaPage wikipediaPage) {
			 
		if (lasPaginasTienenMismaInicial(page, wikipediaPage)) {
			paginasFiltradas.add(wikipediaPage);
		}
		
	}

	private Boolean lasPaginasTienenMismaInicial(WikipediaPage page, WikipediaPage wikipediaPage) {
		return page.getTitle().charAt(0) == (wikipediaPage.getTitle().charAt(0));
	}
}
