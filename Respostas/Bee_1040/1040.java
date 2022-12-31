import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		double N1, N2, N3, N4, exame, media;
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		
		N1 = input.nextDouble();
		N2 = input.nextDouble();
		N3 = input.nextDouble();
		N4 = input.nextDouble();
		
		media = ((2 * N1) + (3 * N2) + (4 * N3) + (1 * N4)) / (2 + 3 + 4 + 1);
		
		System.out.println("Media: " + df.format(media));
		
		if (media >= 7)
			System.out.print("Aluno aprovado.\n");
			
		else if (media >= 5 && media <= 6.9) {
			System.out.print("Aluno em exame.\n");
			exame = input.nextDouble();
			System.out.printf("Nota do exame: %.1f\n", exame);
			
			media = (media + exame) / 2;
			
			if (media >= 5)
				System.out.printf("Aluno aprovado.\n");
				
			else if (media <= 4.9)
				System.out.printf("Aluno reprovado.\n");
				
			System.out.printf("Media final: %.1f\n", media);
		}
		
		else if (media < 5)
			System.out.print("Aluno reprovado.\n");
	}
}