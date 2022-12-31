import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int troco, N100, N50, N20, N10, N5, N2;
		int M1r, M50, M25, M10, M5, M1c;
		double valor;
		
		Scanner input = new Scanner(System.in);
		
		valor = input.nextDouble();
		troco = (int)valor;
		
		// Notas
		N100  = (int) valor / 100;
		troco = troco % 100;
		
		N50   = troco / 50;
		troco = troco % 50;
		
		N20   = troco / 20;
		troco = troco % 20;
		
		N10   = troco / 10;
		troco = troco % 10;
		
		N5	= troco / 5;
		troco = troco % 5;
		
		N2	= troco / 2;
		
		//Moedas
		M1r   = troco % 2;
		
		troco = (int) (valor * 100) - ((int)valor * 100); // Passando os valores para inteiro
		
		M50   = troco / 50;
		troco = troco % 50;
		
		M25   = troco / 25;
		troco = troco % 25;
		
		M10   = troco / 10;
		troco = troco % 10;
		
		M5	= troco / 5;
		
		M1c   = troco % 5;
		
		System.out.printf("NOTAS:\n");
		System.out.printf("%d nota(s) de R$ 100.00\n", N100);
		System.out.printf("%d nota(s) de R$ 50.00\n", N50);
		System.out.printf("%d nota(s) de R$ 20.00\n", N20);
		System.out.printf("%d nota(s) de R$ 10.00\n", N10);
		System.out.printf("%d nota(s) de R$ 5.00\n", N5);
		System.out.printf("%d nota(s) de R$ 2.00\n", N2);
		
		System.out.printf("MOEDAS:\n");
		System.out.printf("%d moeda(s) de R$ 1.00\n", M1r);
		System.out.printf("%d moeda(s) de R$ 0.50\n", M50);
		System.out.printf("%d moeda(s) de R$ 0.25\n", M25);
		System.out.printf("%d moeda(s) de R$ 0.10\n", M10);
		System.out.printf("%d moeda(s) de R$ 0.05\n", M5);
		System.out.printf("%d moeda(s) de R$ 0.01\n", M1c);
	}
}