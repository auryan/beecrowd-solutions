import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int N;
		int A = 1, B = 1, C = 1;
		
		Scanner input = new Scanner(System.in);
		
		N = input.nextInt();
		
		System.out.printf("%d %d %d\n", A, B, C);
		
		for (int i = 1; i != N; i++) {
			B++; C++;
			
			System.out.printf("%d %d %d\n", A, B, C);
			
			B = B + (A + A);
			A++;
			C = A * B;
			
			System.out.printf("%d %d %d\n", A, B, C);
		}
		
		System.out.printf("%d %d %d\n", A, B += 1, C += 1);
	}
}