import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		char escolha;
		double M[][] = new double[12][12];
		double soma = 0;
		int i = 0, j = 0, C = 11, quant = 0;
		
		Scanner input = new Scanner(System.in);
		
		escolha = input.next().charAt(0);
		
		for (; i < 12; i++) {
			for (j = 0; j < 12; j++) {
				M[i][j] = input.nextDouble();
				
				if (j > C) {
					soma += M[i][j];
					quant++;
				}
			}
			
			C--;
		}
		
		if (escolha == 'S')
			System.out.printf("%.1f\n", soma);
		else if (escolha == 'M')
			System.out.printf("%.1f\n", soma / quant);
	}
}