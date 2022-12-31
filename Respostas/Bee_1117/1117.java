import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		double AV1, AV2;
		
		Scanner input = new Scanner(System.in);
		
		do {
			AV1 = input.nextDouble();
			
			if ((AV1 < 0) || (AV1 > 10))
				System.out.println("nota invalida");
		}
		while ((AV1 < 0) || (AV1 > 10));
		
		do {
			AV2 = input.nextDouble();
			
			if ((AV2 < 0) || (AV2 > 10))
				System.out.println("nota invalida");
		}
		while ((AV2 < 0) || (AV2 > 10));
		
		System.out.printf("media = %.2f\n", (AV1 + AV2) / 2);
	}
}