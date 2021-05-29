package unq.po2.tp8.ejercicio3;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroDeLinkEnComun extends Filtro{
	
	public void agregarAListaSiPasaElFiltro(List<WikipediaPage> paginasFiltradas, 
											WikipediaPage page, WikipediaPage wikipediaPage) {
			 
		if (lasPaginasCompartenAlMenosUnLink(page, wikipediaPage)) {
			paginasFiltradas.add(wikipediaPage);
		}
		
	}

	private boolean lasPaginasCompartenAlMenosUnLink(WikipediaPage page, WikipediaPage wikipediaPage) {
		return page.getLinks().stream().filter(wikipediaPage.getLinks()::contains).collect(Collectors.toList()).size() >= 1;
	}
}
