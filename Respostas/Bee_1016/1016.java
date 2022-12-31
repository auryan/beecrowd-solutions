import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int dist;
		
		Scanner input = new Scanner(System.in);
		
		dist = input.nextInt();
		
		System.out.printf("%d minutos\n", (2 * dist));
	}
}