#include <stdio.h>

int main() {
	char escolha;
	float M[12][12], soma = 0;
	int i = 0, j = 0, C1 = 0, C2 = 11, quant = 0;
	
	scanf("%c", &escolha);
	
	for (; i < 12; i++) {
		for (j = 0; j < 12; j++) {
			scanf("%f", &M[i][j]);
			
			if (j < C1 && j < C2) {
				soma += M[i][j];
				quant++;
			}
		}
		
		C1++;
		C2--;
	}
	
	if (escolha == 'S')
		printf("%.1f\n", soma);
	else if (escolha == 'M')
		printf("%.1f\n", soma / quant);
	
	return 0;
}