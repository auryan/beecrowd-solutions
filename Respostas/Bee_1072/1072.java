import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int N, X, in = 0, out = 0;
		
		Scanner input = new Scanner(System.in);
		
		N = input.nextInt();
		
		for (int i = 0; i < N; i++) {
			X = input.nextInt();
			
			if ((X >= 10) && (X <= 20))
				in++;
			else
				out++;
		}
	
		System.out.printf("%d in\n", in);
		System.out.printf("%d out\n", out);
	}
}