import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		double A, B, C;
		
		Scanner input = new Scanner(System.in);
		
		A = input.nextDouble();
		B = input.nextDouble();
		C = input.nextDouble();
		
		System.out.printf("TRIANGULO: %.3f\n", (A * C) / 2);
		System.out.printf("CIRCULO: %.3f\n", 3.14159 * Math.pow(C, 2));
		System.out.printf("TRAPEZIO: %.3f\n", ((A + B) / 2) * C);
		System.out.printf("QUADRADO: %.3f\n", Math.pow(B, 2));
		System.out.printf("RETANGULO: %.3f\n", A * B);
	}
}