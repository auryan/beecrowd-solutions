#include <stdio.h>

int main() {
	int X, Y, soma = 0;
	
	scanf("%d %d", &X, &Y);
	
	if (X <= Y) {
		if ((X % 2) != 0) X++;
		if ((Y % 2) != 0) Y--;
		
		for (; X < Y; Y--) {
			if ((Y % 2) != 0)
				soma += Y;
		}
			
		printf("%d\n", soma);
	}
	
	else if (X >= Y) {
		if ((X % 2) != 0) X--;
		if ((Y % 2) != 0) Y++;
		
		for (; X > Y; X--) {
			if ((X % 2) != 0)
				soma += X;
		}
		
		printf("%d\n", soma);
	}
	
	return 0;
}