#include <stdio.h>

int main() {
	int arrSize = 100;
	double N[arrSize];
	int i = 1;
	
	scanf("%lf", &N[0]);
	
	for (; i < arrSize; i++)
		N[i] = N[i - 1] * 0.5;
		
	for (i = 0; i < arrSize; i++)
		printf("N[%d] = %.4lf\n", i, N[i]);
		
	return 0;
}