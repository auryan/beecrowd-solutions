#include <stdio.h>

int main() {
	int arrSize = 100, i = 0;
	float A[arrSize];
	
	for (i; i < arrSize; i++)
		scanf("%f", &A[i])
		
	for (i = 0; i < arrSize; i++)
		if (A[i] <= 10)
			printf("A[%d] = %.1f\n", i, A[i]);
			
	return 0;
}