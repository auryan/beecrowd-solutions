import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		String animal_type, classe, feed;
		
		Scanner input = new Scanner(System.in);
		
		animal_type = input.nextLine();
		classe = input.nextLine();
		feed = input.nextLine();
		
		if (animal_type.charAt(0) == 'v' && classe.charAt(0) == 'a' && feed.charAt(0) == 'c')
			System.out.println("aguia");
		if (animal_type.charAt(0) == 'v' && classe.charAt(0) == 'a' && feed.charAt(0) == 'o')
			System.out.println("pomba");
		
		if (animal_type.charAt(0) == 'v' && classe.charAt(0) == 'm' && feed.charAt(0) == 'o')
			System.out.println("homem");
		if (animal_type.charAt(0) == 'v' && classe.charAt(0) == 'm' && feed.charAt(0) == 'h')
			System.out.println("vaca");
		
		if (animal_type.charAt(0) == 'i' && classe.charAt(0) == 'i' && feed.charAt(2) == 'm')
			System.out.println("pulga");
		if (animal_type.charAt(0) == 'i' && classe.charAt(0) == 'i' && feed.charAt(2) == 'r')
			System.out.println("lagarta");
		
		if (animal_type.charAt(0) == 'i' && classe.charAt(0) == 'a' && feed.charAt(0) == 'h')
			System.out.println("sanguessuga");
		if (animal_type.charAt(0) == 'i' && classe.charAt(0) == 'a' && feed.charAt(0) == 'o')
			System.out.println("minhoca");
	}
}