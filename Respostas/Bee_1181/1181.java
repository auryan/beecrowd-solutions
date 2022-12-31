import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		char escolha;
		int L;
		double M[][] = new double[12][12];
		double soma = 0;
		int i = 0, j = 0;
		
		Scanner input = new Scanner(System.in);
		
		L = input.nextInt();
		escolha = input.next().charAt(0);
		
		for (; i < 12; i++) {
			for (j = 0; j < 12; j++) {
				M[i][j] = input.nextDouble();
				
				if (i == L)
					soma += M[i][j];
			}
		}
		
		if (escolha == 'S')
			System.out.printf("%.1f\n", soma);
		else if (escolha == 'M')
			System.out.printf("%.1f\n", soma / 12);
	}
}