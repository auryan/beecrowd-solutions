import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int NUMBER, quantHorasTrab;
		double SALARY, valorHora;
		
		Scanner input = new Scanner(System.in);
		
		NUMBER = input.nextInt();
		quantHorasTrab = input.nextInt();
		valorHora = input.nextDouble();
		
		SALARY = valorHora * quantHorasTrab;
		
		System.out.printf("NUMBER = %d\n", NUMBER);
		System.out.printf("SALARY = U$ %.2f\n", SALARY);
	}
}