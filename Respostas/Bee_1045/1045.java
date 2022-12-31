import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		double A, B, C, temp;
		
		Scanner input = new Scanner(System.in);
		
		A = input.nextDouble();
		B = input.nextDouble();
		C = input.nextDouble();
		
		if (A < B) {
			temp = A;
			A = B;
			B = temp;
		}
		
		if (B < C) {
			temp = B;
			B = C;
			C = temp;
		}
		
		if (A < B) { 
			temp = A;
			A = B;
			B = temp;
		}
		
		if (A >= (B + C))
			System.out.printf("NAO FORMA TRIANGULO\n");
		else if ((A * A) == (B * B) + (C * C))
			System.out.printf("TRIANGULO RETANGULO\n");
		else if ((A * A) > (B * B) + (C * C))
			System.out.printf("TRIANGULO OBTUSANGULO\n");
		else if ((A * A) < (B * B) + (C * C))
			System.out.printf("TRIANGULO ACUTANGULO\n");
			
		if (A == B && B == C)
			System.out.printf("TRIANGULO EQUILATERO\n");
		else if ((A == B || A == C) || (B == C || B == A))
			System.out.printf("TRIANGULO ISOSCELES\n");
	}
}