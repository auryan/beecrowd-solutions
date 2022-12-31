import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int X, Y, soma = 0;
		
		Scanner input = new Scanner(System.in);
		
		X = input.nextInt();
		Y = input.nextInt();
		
		if (X <= Y) {
			if ((X % 2) != 0) X++;
			if ((Y % 2) != 0) Y--;
			
			for (; X < Y; Y--) {
				if ((Y % 2) != 0)
					soma += Y;
			}
				
			System.out.println(soma);
		}
		
		else if (X >= Y) {
			if ((X % 2) != 0) X--;
			if ((Y % 2) != 0) Y++;
			
			for (; X > Y; X--) {
				if ((X % 2) != 0)
					soma += X;
			}
			
			System.out.println(soma);
		}
	}
}