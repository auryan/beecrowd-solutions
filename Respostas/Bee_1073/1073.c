#include <stdio.h>
#include <math.h>

int main() {
	int N;
	
	scanf("%d", &N);
	
	for (int i = 1; N >= i; i++) {
		if ((i % 2) == 0)
			printf("%d^2 = %.0f\n", i, pow(i, 2));
	}
	
	return 0;
}