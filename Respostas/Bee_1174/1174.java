import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int i = 0;
		double A[] = new double[100];
		
		Scanner input = new Scanner(System.in);
		
		for (; i < A.length; i++)
			A[i] = input.nextDouble();
			
		for (i = 0; i < A.length; i++)
			if (A[i] <= 10)
				System.out.printf("A[%d] = %.1f\n", i, A[i]);
	}
}