import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int X;
		
		Scanner input = new Scanner(System.in);
		
		X = input.nextInt();
		
		for (int i = 0; i < 12; i++) {
			if ((X % 2) == 1)
				System.out.println(X);
				
			X++;
		}
	}
}