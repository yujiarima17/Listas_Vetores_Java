public class ListaNetflix {
	
	private Node inicio;
	
	
	public void add(Object x) {
		Node novo = new Node();
		novo.setValor(x);
		
		if (inicio == null) {
			inicio = novo;
			inicio.setAnterior(novo);
			inicio.setProximo(novo);
		} else {
			inicio.getAnterior().setProximo(novo);
			novo.setAnterior(inicio.getAnterior());
			
			inicio.setAnterior(novo);
			novo.setProximo(inicio);
		}
	}
	
	public Node getInicio() {
		return inicio;
	}

}



/**
 * Estrutura para representar um nó de uma lista encadeada.
 * Possui uma referência para o valor que armazena, outra para 
 * o próximo nó da lista encadeada e outra para o nó anterior
 * na lista encadeada.
 *
 */
class Node {

	private Object valor;
	private Node proximo;
	private Node anterior;

	public Node getAnterior() {
		return anterior;
	}

	public void setAnterior(Node anterior) {
		this.anterior = anterior;
	}

	public Object getValor() {
		return valor;
	}

	public void setValor(Object valor) {
		this.valor = valor;
	}

	public Node getProximo() {
		return proximo;
	}

	public void setProximo(Node proximo) {
		this.proximo = proximo;
	}

}
