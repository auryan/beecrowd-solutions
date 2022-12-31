import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int a, b, c, d, hora_min;
		
		Scanner input = new Scanner(System.in);
		
		a = input.nextInt();
		c = input.nextInt();
		b = input.nextInt();
		d = input.nextInt();
		
		hora_min = ((b * 60) + d) - ((a * 60) + c);
		
		if (hora_min <= 0)
			hora_min += (24 * 60);
			
		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", hora_min / 60, hora_min % 60);
	}
}