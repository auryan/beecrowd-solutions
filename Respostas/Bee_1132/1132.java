import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int X, Y, soma = 0;
		
		Scanner input = new Scanner(System.in);
		
		X = input.nextInt();
		Y = input.nextInt();
		
		if (X < Y) {
			for (; X <= Y; X++) {
				if ((X % 13) == 0)
					soma += 0;
				else
					soma += X;
			}
			
			System.out.println(soma);
		}
		
		else {
			for (; X >= Y; Y++) {
				if ((Y % 13) == 0)
					soma += 0;
				else
					soma += Y;
			}
			
			System.out.println(soma);
		}
	}
}