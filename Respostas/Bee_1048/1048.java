import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		double salario;
		
		Scanner input = new Scanner(System.in);
		
		salario = input.nextDouble();
		
		if (salario > 0 && salario <= 400) {
			System.out.printf("Novo salario: %.2f\n", (salario * 0.15)  + salario);
			System.out.printf("Reajuste ganho: %.2f\n", salario * 0.15);
			System.out.print("Em percentual: 15 %\n");
		}
		
		else if (salario >= 400.01 && salario <= 800) {
			System.out.printf("Novo salario: %.2f\n", (salario * 0.12) + salario);
			System.out.printf("Reajuste ganho: %.2f\n", salario * 0.12);
			System.out.printf("Em percentual: 12 %\n");
		}
		
		else if (salario >= 800.01 & salario <= 1200) {
			System.out.printf("Novo salario: %.2f\n", (salario * 0.10) + salario);
			System.out.printf("Reajuste ganho: %.2f\n", salario * 0.10);
			System.out.print("Em percentual: 10 %\n");
		}
		
		else if (salario >= 1200.01 & salario <= 2000) {
			System.out.printf("Novo salario: %.2f\n", (salario * 0.07) + salario);
			System.out.printf("Reajuste ganho: %.2f\n", salario * 0.07);
			System.out.print("Em percentual: 7 %\n");
		}
		
		else if (salario > 2000) {
			System.out.printf("Novo salario: %.2f\n", (salario * 0.04) + salario);
			System.out.printf("Reajuste ganho: %.2f\n", salario * 0.04);
			System.out.print("Em percentual: 4 %\n");
		}
	}
}