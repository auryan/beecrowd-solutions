import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int X, Y, calc;
		
		Scanner input = new Scanner(System.in);
		
		X = input.nextInt();
		Y = input.nextInt();
		
		if (X < Y) {
			for (X++; X < Y; X++) {
				calc = X % 5;
				
				if (calc == 2 || calc == 3)
					System.out.println(X);
			}
		}
		
		else {
			for (Y++; X > Y; Y++) {
				calc = Y % 5;
				
				if (calc == 2 || calc == 3)
					System.out.println(Y);
			}
		}
	}
}