import java.util.Scanner;

public class Principal{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Nome: ");
		String nome = sc.next();
		Fila<String> fila = new Fila<String>(nome);

		for(int i = 0; i < 5; i++){
			nome = sc.next();
			fila.enqueue(nome);
		}

		//System.out.println("TOP:"+fila.top().getDado());

		for(int i = 0; i < 7; i++){
			System.out.println("dequeue()-> Nome: "+fila.dequeue().getDado());
			//System.out.println("top()-> Nome: "+fila.top().getDado());
		}

	}
}
