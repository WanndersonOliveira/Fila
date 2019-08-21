public class Celula<E>{
	private E dado;
	private Celula posterior;

	public Celula(E dado){
		this.dado = dado;
		this.posterior = null;
	}

	public Celula getPosterior(){
		return this.posterior;
	}

	public void setPosterior(Celula posterior){
		this.posterior = posterior;
	}

	public E getDado(){
		return this.dado;
	}

	public void setDado(E dado){
		this.dado = dado;
	}
}
