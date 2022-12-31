import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int valor, N100, N50, N20, N10, N5, N2, N1;
		
		Scanner input = new Scanner(System.in);
		
		valor = input.nextInt();
		
		N100 = valor / 100;
		N50  = (valor % 100) / 50;
		N20  = ((valor % 100) % 50) / 20;
		N10  = (((valor % 100) % 50) % 20) / 10;
		N5   = ((((valor % 100) % 50) % 20) % 10) / 5;
		N2   = (((((valor % 100) % 50) % 20) % 10) % 5) / 2;
		N1   = ((((((valor % 100) % 50) % 20) % 10) % 5) % 2);
		
		System.out.printf("%d\n", valor);
		
		System.out.printf("%d nota(s) de R$ 100,00\n", N100);
		System.out.printf("%d nota(s) de R$ 50,00\n", N50);
		System.out.printf("%d nota(s) de R$ 20,00\n", N20);
		System.out.printf("%d nota(s) de R$ 10,00\n", N10);
		System.out.printf("%d nota(s) de R$ 5,00\n", N5);
		System.out.printf("%d nota(s) de R$ 2,00\n", N2);
		System.out.printf("%d nota(s) de R$ 1,00\n", N1);
	}
}