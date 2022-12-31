#include <stdio.h>

int main() {
	int X, Y, soma = 0;
	
	scanf("%d %d", &X, &Y);
	
	if (X < Y) {
		for (; X <= Y; X++) {
			if ((X % 13) == 0)
				soma += 0;
			else
				soma += X;
		}
		
		printf("%d\n", soma);
	}
	
	else {
		for (; X >= Y; Y++) {
			if ((Y % 13) == 0)
				soma += 0;
			else
				soma += Y;
		}
		
		printf("%d\n", soma);
	}
	
	return 0;
}