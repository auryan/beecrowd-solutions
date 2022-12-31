#include <stdio.h>

int main() {
	int arrSize = 20;
	int N[arrSize];
	int i = arrSize - 1;
	
	for (; i >= 0; i--)
		scanf("%d", &N[i]);
		
	for (i = 0; i < arrSize; i++) 
		printf("N[%d] = %d\n", i, N[i]);
		
	return 0;
}