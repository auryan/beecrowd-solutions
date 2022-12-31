#include <stdio.h>

int main() {
	int X, Y, calc;
	
	scanf("%d %d", &X, &Y);
	
	if (X < Y) {
		for (X++; X < Y; X++) {
			calc = X % 5;
			
			if (calc == 2 || calc == 3)
				printf("%d\n", X);
		}
	}
	
	else {
		for (Y++; X > Y; Y++) {
			calc = Y % 5;
			
			if (calc == 2 || calc == 3)
				printf("%d\n", Y);
		}
	}
	
	return 0;
}