import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		double num;
		
		Scanner input = new Scanner(System.in);
		
		num = input.nextDouble();
		
		if (num >= 0 && num <= 25)
			System.out.print("Intervalo [0,25]\n");
		else if (num > 25 && num <= 50)
			System.out.print("Intervalo (25,50]\n");
		else if (num > 50 && num <= 75)
			System.out.print("Intervalo (50,75]\n");
		else if (num > 75 && num <= 100)
			System.out.print("Intervalo (75,100]\n");
		else
			System.out.print("Fora de intervalo\n");
	}
}