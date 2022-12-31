import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		double raio;
		
		Scanner input = new Scanner(System.in);
		
		raio = input.nextDouble();
		
		System.out.printf("VOLUME = %.3f\n", (4.0 / 3) * 3.14159 * (Math.pow(raio, 3)));
	}
}