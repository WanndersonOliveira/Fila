public class Fila <E>{
	private Celula<E> inicio;
	private Celula<E> fim;
	private final int TAMANHO = 10;

	public Fila(E dado){
		inicio = new Celula<E>(dado);
		fim = inicio;
	}

	public void push(E dado){
		Celula<E> novo = new Celula<E>(dado);
		novo.setAnterior(fim);
		fim = novo;
	}

	public Celula pop(){
		Celula<E> atual = fim;
		Celula<E> velho = inicio;

		while(atual.getAnterior().getAnterior() != null){
			atual = atual.getAnterior();
		}

		atual.setAnterior(null);
		inicio = atual;
		Celula<E> retorno = new Celula<E>(velho.getDado());
		velho = null;
		return retorno;
	}

	public int buscar(E dado){
		Celula<E> atual = fim;
		int index = (this.TAMANHO-1);

		while(atual != null){
			if(atual.getDado().equals(dado)){
				break;
			}

			atual = atual.getAnterior();
			index--;
		}

		return index;
	}

	public void mostrar(){
		Celula<E> atual = fim;

		while(atual != null){
			System.out.println(atual.getDado());

			atual = atual.getAnterior();
		}
	}


}	