import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int dias, a, m, d;
		
		Scanner input = new Scanner(System.in);
		
		dias = input.nextInt();
		
		a = dias / 365;
		m = (dias % 365) / 30;
		d = (dias % 365) % 30;
		
		System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", a, m, d);
	}
}