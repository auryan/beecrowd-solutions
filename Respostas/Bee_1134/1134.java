import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int number, alcool = 0, gasolina = 0, diesel= 0;
		
		Scanner input = new Scanner(System.in);
		
		do {
			number = input.nextInt();
			
			switch (number) {
				case 1: alcool++; break;
				case 2: gasolina++; break;
				case 3: diesel++; break;
			}
		}
		while (number != 4);
		
		System.out.printf("MUITO OBRIGADO\n");
		System.out.printf("Alcool: %d\n", alcool);
		System.out.printf("Gasolina: %d\n", gasolina);
		System.out.printf("Diesel: %d\n", diesel);
	}
}