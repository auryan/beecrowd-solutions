import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int v1, v2, v3;
		
		Scanner input = new Scanner(System.in);
		
		v1 = input.nextInt();
		v2 = input.nextInt();
		v3 = input.nextInt();
		
		if (v1 < v2) {
			if (v2 < v3) {
				System.out.printf("%d\n%d\n%d\n", v1, v2, v3);
				System.out.printf("\n%d\n%d\n%d\n", v1, v2, v3);
			}
			
			else if (v1 < v3) {
				System.out.printf("%d\n%d\n%d\n", v1, v3, v2);
				System.out.printf("\n%d\n%d\n%d\n", v1, v2, v3);
			}
			
			else {
				System.out.printf("%d\n%d\n%d\n", v3, v1, v2);
				System.out.printf("\n%d\n%d\n%d\n", v1, v2, v3);
			}
		}
		
		else if (v2 < v3) {
			if (v1 < v3) {
				System.out.printf("%d\n%d\n%d\n", v2, v1, v3);
				System.out.printf("\n%d\n%d\n%d\n", v1, v2, v3);
			}
			
			else {
				System.out.printf("%d\n%d\n%d\n", v2, v3, v1);
				System.out.printf("\n%d\n%d\n%d\n", v1, v2, v3);
			}
		}
		
		else {
			System.out.printf("%d\n%d\n%d\n", v3, v2, v1);
			System.out.printf("\n%d\n%d\n%d\n", v1, v2, v3);
		}
	}
}