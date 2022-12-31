import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		double x1, y1;
		double x2, y2;
		
		Scanner input = new Scanner(System.in);
		
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		
		System.out.printf("%.4f\n", Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
	}
}