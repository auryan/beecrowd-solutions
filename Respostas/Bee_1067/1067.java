import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int X;
		
		Scanner input = new Scanner(System.in);
		
		X = input.nextInt();
		
		for (int i = 0; X >= i; i++) {
			if ((i % 2) == 1)
				System.out.println(i);
		}
	}
}