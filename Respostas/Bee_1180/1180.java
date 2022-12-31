import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int arrSize;
		
		Scanner input = new Scanner(System.in);
		
		arrSize = input.nextInt();
		
		int X[] = new int[arrSize];
		
		X[0] = input.nextInt();
		
		int menor = X[0];
		int index = 0;
		
		for (int i = 1; i < arrSize; i++) {
			X[i] = input.nextInt();
			
			if (X[i] < menor) {
				menor = X[i];
				index = i;
			}
		}
		
		System.out.printf("Menor valor: %d\nPosicao: %d\n", menor, index);
	}
}