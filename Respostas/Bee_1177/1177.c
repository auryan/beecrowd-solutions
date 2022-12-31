#include <stdio.h>

int main() {
	int arrSize = 1000;
	int T, N[arrSize];
	int i = 0, j = 0;
	
	scanf("%d", &T);
	
	for (; i < arrSize; i++, j++) {
		if (j == T)
			j = 0;
			
		N[i] = j;
	}
	
	for (i = 0; i < arrSize; i++)
		printf("N[%d] = %d\n", i, N[i]);
		
	return 0;
}