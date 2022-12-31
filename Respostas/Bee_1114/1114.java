import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int pass;
		
		Scanner input = new Scanner(System.in);
		
		do {
			pass = input.nextInt();
			
			if (pass != 2002)
				System.out.println("Senha Invalida");
		} while (pass != 2002);
		
		System.out.println("Acesso Permitido");
	}
}