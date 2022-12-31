#include <stdio.h>

int main() {
	int arrSize;
	int menor, index;
	
	scanf("%d", &arrSize);
	
	int X[arrSize];
	
	scanf("%d", &X[0]);
	menor = X[0];
	
	for (int i = 1; i < arrSize; i++) {
		scanf("%d", &X[i]);
		
		if (X[i] < menor) {
			menor = X[i];
			index = i;
		}
	}
	
	printf("Menor valor: %d\nPosicao: %d\n", menor, index);
	
	return 0;
}