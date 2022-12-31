import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int X[] = new int[10];
		int i = 0;
		
		Scanner input = new Scanner(System.in);
		
		for (; i < X.length; i++)
			X[i] = input.nextInt();
			
		for (i = 0; i < X.length; i++) 
			if (X[i] <= 0)
				X[i] = 1;
				
		for (i = 0; i < X.length; i++)
			System.out.printf("X[%d] = %d\n", i, X[i]);		
	}
}