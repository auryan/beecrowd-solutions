import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		double salario, taxa;
		
		Scanner input = new Scanner(System.in);
		
		salario = input.nextDouble();
		
		if (salario > 0 && salario <= 2000)
			System.out.print("Isento\n");
			
		else if (salario >= 2000.01 && salario <= 3000)
			System.out.printf("R$ %.2f\n", (salario - 2000) * 0.08);
			
		else if (salario >= 3000.01 && salario <= 4500) {
			taxa = 1000 * 0.08;
			salario = (salario - 3000) * 0.18;
			System.out.printf("R$ %.2f\n", salario + taxa);
		}
		
		else {
			taxa = (1000 * 0.08) + (1500 * 0.18);
			salario = (salario - 4500) * 0.28;
			System.out.printf("R$ %.2f\n", salario + taxa);
		}
	}
}