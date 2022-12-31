import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		double A, B, MEDIA;
		
		Scanner input = new Scanner(System.in);
		
		A = input.nextDouble();
		B = input.nextDouble();
		
		MEDIA = ((3.5 * A) + (7.5 * B)) / 11;
		
		System.out.printf("MEDIA = %.5f\n", MEDIA);
	}
}