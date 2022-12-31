import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int a, b, hora_min;
		
		Scanner input = new Scanner(System.in);
		
		a = input.nextInt();
		b = input.nextInt();
		
		hora_min = (b * 60) - (a * 60);
		
		if (hora_min <= 0)
			hora_min += (24 * 60);
			
		System.out.printf("O JOGO DUROU %d HORA(S)\n", hora_min / 60);
	}
}