import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int segundos, h, m, s;
		
		Scanner input = new Scanner(System.in);
		
		segundos = input.nextInt();
		
		h = segundos / 3600;
		m = (segundos % 3600) / 60;
		s = (segundos % 3600) % 60;
		
		System.out.printf("%d:%d:%d\n", h, m, s);
	}
}