import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int number, par = 0;
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			number = input.nextInt();
			if (number % 2 == 0) par++;
		}
		
		System.out.printf("%d valores pares\n", par);
	}
}