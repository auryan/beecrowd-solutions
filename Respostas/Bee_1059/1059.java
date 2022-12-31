import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		for (int number = 1; number <= 100; number++) {
			if ((number % 2) == 0)
				System.out.println(number);
		}
	}
}