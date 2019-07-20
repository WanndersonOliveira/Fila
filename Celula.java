public class Celula<E>{
	private E dado;
	private Celula anterior;

	public Celula(E dado){
		this.dado = dado;
		this.anterior = null;
	}

	public Celula getAnterior(){
		return this.anterior;
	}

	public void setAnterior(Celula anterior){
		this.anterior = anterior;
	}

	public E getDado(){
		return this.dado;
	}

	public void setDado(E dado){
		this.dado = dado;
	}
}