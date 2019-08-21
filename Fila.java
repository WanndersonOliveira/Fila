public class Fila <E>{
	private Celula<E> inicio;
	private Celula<E> fim;
	private int size;


	public Fila(E dado){
		inicio = new Celula<E>(dado);
		fim = inicio;
		this.size = 1;
	}

	public void enqueue(E dado){
		Celula<E> novo = new Celula<E>(dado);
		fim.setPosterior(novo);
		fim = novo;
		this.size++;
	}

	public Celula dequeue(){
		Celula<E> atual = fim;
		Celula<E> velho = inicio;

		if(isEmpty()){
				throw new ErroFilaVazia("enqueue() -> A fila está vazia!");
		}

		inicio = inicio.getPosterior();

		velho.setPosterior(null);

		Celula<E> retorno = velho;
		this.size--;
		return retorno;
	}

	public boolean isEmpty(){
		boolean check = false;

		if(this.size == 0){
			check = true;
		}

		return check;
	}

	public Celula top(){
		if(isEmpty()){
				throw new ErroFilaVazia("top() -> A fila está vazia!");
		}

		return this.inicio;
	}




	public void mostrar(){
		Celula<E> atual = inicio;

		while(atual != null){
			System.out.println(atual.getDado());

			atual = atual.getPosterior();
		}
	}


}
