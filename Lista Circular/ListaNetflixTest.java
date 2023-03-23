import static org.junit.Assert.*;

import org.junit.Test;

public class ListaNetflixTest {

	@Test
	public void test() {
		ListaNetflix lista = new ListaNetflix();
		lista.add("EP 1");
		lista.add("EP 2");
		lista.add("EP 3");
		
		Node inicio = lista.getInicio();
		assertEquals("EP 1", inicio.getValor());
		assertEquals("EP 2", caminhar(inicio, 1).getValor());
		assertEquals("EP 3", caminhar(inicio, 2).getValor());
		assertEquals("EP 1", caminhar(inicio, 3).getValor());

		assertEquals("EP 3", voltar(inicio, 1).getValor());
		assertEquals("EP 2", voltar(inicio, 2).getValor());
		assertEquals("EP 1", voltar(inicio, 3).getValor());
		assertEquals("EP 3", voltar(inicio, 4).getValor());
	}
	
	private Node caminhar(Node node, int n) {
		Node resultado = node;
		for (int i = 0; i < n; i++) {
			resultado = resultado.getProximo();
		}
		return resultado;
	}

	private Node voltar(Node node, int n) {
		Node resultado = node;
		for (int i = 0; i < n; i++) {
			resultado = resultado.getAnterior();
		}
		return resultado;
	}

}
