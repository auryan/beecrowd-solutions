import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int codPe1, quantPe1;
		int codPe2, quantPe2;	
		double valorPe1, valorPe2;
		
		Scanner input = new Scanner(System.in);
		
		codPe1 = input.nextInt();
		quantPe1 = input.nextInt();
		valorPe1 = input.nextDouble();
		
		codPe2 = input.nextInt();
		quantPe2 = input.nextInt();
		valorPe2 = input.nextDouble();
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", (quantPe1 * valorPe1) + (quantPe2 * valorPe2));
	}
}