import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int a, b, c, maiorAB, maiorABC;
		
		Scanner input = new Scanner(System.in);
		
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		maiorAB = (a + b + Math.abs(a - b)) / 2;
		maiorABC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;
		
		if (maiorABC == a)
			System.out.printf("%d eh o maior\n", a);
		else if (maiorABC == b)
			System.out.printf("%d eh o maior\n", b);
		else if (maiorABC == c)
			System.out.printf("%d eh o maior\n", c);
	}
}