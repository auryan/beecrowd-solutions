import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int number;
		int par = 0, impar = 0;
		int negativo = 0, positivo = 0;
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			number = input.nextInt();
			
			if (number % 2 == 0)
				par++;
			else
				impar++;
				
			if (number >  0)
				positivo++;
			else if (number < 0)
				negativo++;
		}
		
		System.out.printf("%d valor(es) par(es)\n%d valor(es) impar(es)\n", par, impar);
		System.out.printf("%d valor(es) positivo(s)\n%d valor(es) negativo(s)\n", positivo, negativo);
	}
}