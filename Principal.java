import java.util.Scanner;

public class Principal{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = sc.next();
		Fila<String> fila = new Fila<String>(nome);

		System.out.print("Nome: ");
		nome = sc.next();
		fila.push(nome);

		System.out.print("Nome: ");
		nome = sc.next();
		fila.push(nome);

		fila.mostrar();
		System.out.println("\nElemento retirado: "+fila.pop().getDado());
		System.out.println("\n");
		fila.mostrar();

		System.out.println("\nNome a procurar: ");
		nome = sc.next();

		System.out.println("Nome encontrado no índice: "+fila.buscar(nome));

	}
}