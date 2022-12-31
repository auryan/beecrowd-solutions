import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int A, B, C, D;
		
		Scanner input = new Scanner(System.in);
		
		A = input.nextInt();
		B = input.nextInt();
		C = input.nextInt();
		D = input.nextInt();
		
		if ((B > C) && (D > A) && ((C + D) > (A + B)) && C > 0 && D > 0 && (A % 2) == 0)
			System.out.print("Valores aceitos\n");
		else
			System.out.print("Valores nao aceitos\n");
	}
}