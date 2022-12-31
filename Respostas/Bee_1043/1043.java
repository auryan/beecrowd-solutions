import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		double A, B, C;
		
		Scanner input = new Scanner(System.in);
		
		A = input.nextDouble();
		B = input.nextDouble();
		C = input.nextDouble();
		
		if (((A + B) > C) && ((B + C) > A) && ((A + C) > B))
			System.out.printf("Perimetro = %.1f\n", A + B + C);
		else
			System.out.printf("Area = %.1f\n", ((A + B) / 2) * C);
	}
}