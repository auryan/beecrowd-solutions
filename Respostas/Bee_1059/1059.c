#include <stdio.h>

int main() {
	for (int number = 1; number <= 100; number++) {
		if ((number % 2) == 0)
			printf("%d\n", number);
	}
	
	return 0;
}