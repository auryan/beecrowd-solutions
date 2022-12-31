import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int N[] = new int[20];
		int i = N.length - 1;
		
		Scanner input = new Scanner(System.in);
		
		for (; i >= 0; i--)
			N[i] = input.nextInt();
			
		for (i = 0; i < N.length; i++)
			System.out.printf("N[%d] = %d\n", i, N[i]);
	}
}