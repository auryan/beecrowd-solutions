import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int T;
		int N[] = new int[1000];
		int i = 0, j = 0;
		
		Scanner input = new Scanner(System.in);
		
		T = input.nextInt();
		
		for (; i < N.length; i++, j++) {
			if (j == T)
				j = 0;
				
			N[i] = j;
		}
		
		for (i = 0; i < N.length; i++)
			System.out.printf("N[%d] = %d\n", i, N[i]);
	}
}