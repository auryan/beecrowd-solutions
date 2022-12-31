#include <stdio.h>

int main() {
	int number, par = 0;
	
	for (int i = 0; i < 5; i++) {
		scanf("%d", &number);
		if (number % 2 == 0) par++;
	}
	
	printf("%d valores pares\n", par);
	
	return 0;
}