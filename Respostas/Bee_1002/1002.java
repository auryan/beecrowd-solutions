import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		double A, raio, pi = 3.14159;
		
		Scanner input = new Scanner(System.in);
		
		raio = input.nextDouble();
		
		A = pi * Math.pow(raio, 2);
		
		System.out.printf("A=%.4f\n", A);
	}
}