#include <stdio.h>

int main() {
	int arrSize = 10;
	int N[arrSize];
	
	scanf("%d", &N[0]);
	
	printf("N[0] = %d\n", N[0]);
	
	for (int i = 1; i < arrSize; i++) {
		N[i] = N[i - 1] * 2;
		printf("N[%d] = %d\n", i, N[i]);
	}
	
	return 0;
}