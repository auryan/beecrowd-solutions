import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int numero, posicao = 1;
		int maior_numero = 0, posicao_do_maior = 0;
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 1; i <= 100; i++) {
			numero = input.nextInt();
			
			if (maior_numero < numero) {
				maior_numero = numero;
				posicao_do_maior = i;
			}
		}
		
		System.out.println(maior_numero);
		System.out.println(posicao_do_maior);
	}
}