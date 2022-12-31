import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		double A, B, C, MEDIA;
		
		Scanner input = new Scanner(System.in);
		
		A = input.nextDouble();
		B = input.nextDouble();
		C = input.nextDouble();
		
		MEDIA = ((2 * A) + (3 * B) + (5 * C)) / (2 + 3 + 5);
		
		System.out.printf("MEDIA = %.1f\n", MEDIA);
	}
}