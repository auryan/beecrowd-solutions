import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int codProd, quantProd;
		double total;
		
		Scanner input = new Scanner(System.in);
		
		codProd = input.nextInt();
		quantProd = input.nextInt();
		
		switch (codProd) {
			case 1:
				total = 4.00 * quantProd;
				System.out.printf("Total: R$ %.2f\n", total);
				break;
				
			case 2:
				total = 4.50 * quantProd;
				System.out.printf("Total: R$ %.2f\n", total);
				break;
				
			case 3:
				total = 5.00 * quantProd;
				System.out.printf("Total: R$ %.2f\n", total);
				break;
				
			case 4:
				total = 2.00 * quantProd;
				System.out.printf("Total: R$ %.2f\n", total);
				break;
				
			case 5:
				total = 1.50 * quantProd;
				System.out.printf("Total: R$ %.2f\n", total);
				break;
		}
	}
}