#include <stdio.h>

int main() {
	int arrSize = 10, i = 0;
	int X[arrSize];
	
	for (; i < arrSize; i++)
		scanf("%d", &X[i]);
		
	for (i = 0; i < arrSize; i++) 
		if (X[i] <= 0)
			X[i] = 1;
			
	for (i = 0; i < arrSize; i++)
		printf("X[%d] = %d\n", i, X[i]);
		
	return 0;
}