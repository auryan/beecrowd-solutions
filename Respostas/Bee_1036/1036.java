import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		double A, B, C, delta, R1, R2;
		
		Scanner input = new Scanner(System.in);
		
		A = input.nextDouble();
		B = input.nextDouble();
		C = input.nextDouble();
		
		if (A == 0) {
			System.out.print("Impossivel calcular\n");
			return;
		}
		
		else {
			delta = Math.pow(B, 2) - (4 * A * C);
			
			if (delta < 0) {
				System.out.print("Impossivel calcular\n");
				return;
			}
			
			else {
				R1 = ((-B) + Math.sqrt(delta)) / (2 * A);
				R2 = ((-B) - Math.sqrt(delta)) / (2 * A);
				
				System.out.printf("R1 = %.5f\n", R1);
				System.out.printf("R2 = %.5f\n", R2);
			}
		}
	}
}