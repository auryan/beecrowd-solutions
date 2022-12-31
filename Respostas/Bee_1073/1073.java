import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int N;
		
		Scanner input = new Scanner(System.in);
		
		N = input.nextInt();
		
		for (int i = 1; N >= i; i++) {
			if ((i % 2) == 0)
				System.out.printf("%d^2 = %.0f\n", i, Math.pow(i, 2));
		}
	}
}