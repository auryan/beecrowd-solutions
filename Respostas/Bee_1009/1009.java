import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		String nome;
		double salFixo, totalVendas, TOTAL;
		
		Scanner input = new Scanner(System.in);
		
		nome = input.nextLine();
		salFixo = input.nextDouble();
		totalVendas = input.nextDouble();
		
		TOTAL = salFixo + (totalVendas * 0.15);
		
		System.out.printf("TOTAL = R$ %.2f\n", TOTAL);
	}
}