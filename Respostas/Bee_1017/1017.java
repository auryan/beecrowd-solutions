import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int tempoViagem, veloMedia, distancia;
		
		Scanner input = new Scanner(System.in);
		
		tempoViagem = input.nextInt();
		veloMedia = input.nextInt();
		
		distancia = veloMedia * tempoViagem;
		
		System.out.printf("%.3f\n", (0.08333333333333333333333333333333 * distancia));
	}
}