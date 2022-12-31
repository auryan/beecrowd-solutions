import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		double N[] = new double[100];
		int i = 1;
		
		Scanner input = new Scanner(System.in);
		
		N[0] = input.nextDouble();
		
		for (; i < N.length; i++)
			N[i] = N[i - 1] * 0.5;
			
		for (i = 0; i < N.length; i++)
			System.out.printf("N[%d] = %.4f\n", i, N[i]);
	}
}