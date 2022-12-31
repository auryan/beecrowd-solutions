import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int N[] = new int[10];
		
		Scanner input = new Scanner(System.in);
		
		N[0] = input.nextInt();
		
		System.out.printf("N[0] = %d\n", N[0]);
		
		for (int i = 1; i < N.length; i++) {
			N[i] = N[i - 1] * 2;
			System.out.printf("N[%d] = %d\n", i, N[i]);
		}
	}
}