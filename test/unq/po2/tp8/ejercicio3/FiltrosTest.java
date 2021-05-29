package unq.po2.tp8.ejercicio3;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.mockito.Mock;
import org.mockito.mock.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class FiltrosTest {

	private Filtro filtroDeLinkEnComun;
	private Filtro filtroPropiedadEnComun;
	private Filtro filtroMismaLetraInicial;
	@Mock private Page pagina1;
	@Mock private Page pagina2;
	@Mock private Page pagina3;
	@Mock private Page pagina4;
	@Mock private Page pagina5;
	private List<WikipediaPage> listaDeWikipages;
	private Map<String,WikipediaPage> mapDeWikiPage1;
	private ArrayList<WikipediaPage> listaVacia2;
	
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		filtroDeLinkEnComun = new FiltroDeLinkEnComun();
		filtroPropiedadEnComun = new FiltroPropiedadEnComun();
		filtroMismaLetraInicial = new FiltroMismaLetraInicial();
		pagina1 = mock(Page.class);
		pagina2 = mock(Page.class);
		pagina3 = mock(Page.class);
		pagina4 = mock(Page.class);
		pagina5 = mock(Page.class);
		listaVacia2 = new ArrayList<WikipediaPage>(); 
		listaDeWikipages = new ArrayList<WikipediaPage>();
		listaDeWikipages.add(pagina2);
		listaDeWikipages.add(pagina3);
		
		mapDeWikiPage1 = new HashMap<String, WikipediaPage>();
		mapDeWikiPage1.put("birth_place", pagina2);
		when(pagina1.getInfobox()).thenReturn(mapDeWikiPage1);
	}

	@Test
	void test1_UnFiltroDeMismaLetraInicialRecibe2PaginasYEncuentraSimilitudes() {
		when(pagina1.getTitle()).thenReturn("TSD");
		when(pagina2.getTitle()).thenReturn("Titulo2");
		when(pagina3.getTitle()).thenReturn("Ttra cosa"); 
		List<WikipediaPage> paginasFiltradas = 
				filtroMismaLetraInicial.getSimilarPages(pagina1, listaDeWikipages); 
		
		assertEquals(2,paginasFiltradas.size());
	}
	
	@Test
	void test2_UnFiltroDeMismaLetraInicialRecibe2PaginasYNoEncuentraSimilitudes() {
		when(pagina1.getTitle()).thenReturn("ASD");
		when(pagina2.getTitle()).thenReturn("Titulo2");
		when(pagina3.getTitle()).thenReturn("Otra cosa"); 
		List<WikipediaPage> paginasFiltradas = 
				filtroMismaLetraInicial.getSimilarPages(pagina1, listaVacia2); 
		
		assertEquals(0,paginasFiltradas.size());
	}

	@Test // la similitud es la pagina 5 
	void test3_UnFiltroLinkEnComunRecibeUnaPageYUnaListaEncuentra1Similitud() {
		when(pagina1.getLinks()).thenReturn(Arrays.asList(pagina4, pagina5));
		when(pagina2.getLinks()).thenReturn(Arrays.asList(pagina3, pagina5));
		when(pagina3.getLinks()).thenReturn(Arrays.asList(pagina2, pagina1));
		List<WikipediaPage> result = this.filtroDeLinkEnComun.getSimilarPages(pagina1, listaDeWikipages);
		assertEquals(1, result.size());
	}
	
	@Test
	void test4_UnFiltroPropiedadEnComunRecibeUnaPageYUnaListaYEncuentraUnaSimilitud() {
		HashMap<String, WikipediaPage> mapConUnaSimilitud = new HashMap<String, WikipediaPage>();
		mapConUnaSimilitud.put("birth_place", pagina3);
		
		when(pagina2.getInfobox()).thenReturn(mapConUnaSimilitud);
		when(pagina3.getInfobox()).thenReturn(new HashMap<String, WikipediaPage>());
		
		List<WikipediaPage> result = this.filtroPropiedadEnComun.getSimilarPages(pagina1, listaDeWikipages);
		assertEquals(1, result.size());
	}
	
	
}
