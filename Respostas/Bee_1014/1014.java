import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int X;
		double Y;
		
		Scanner input = new Scanner(System.in);
		
		X = input.nextInt();
		Y = input.nextDouble();
		
		System.out.printf("%.3f km/l\n", X / Y);
	}
}