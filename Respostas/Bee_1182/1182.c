#include <stdio.h>

int main() {
	char escolha;
	int C;
	float M[12][12], soma = 0;
	int i = 0, j = 0;
	
	scanf("%d %c", &C, &escolha);
	
	for (; i < 12; i++) {
		for (j = 0; j < 12; j++) {
			scanf("%f", &M[i][j]);
			
			if (j == C)
				soma += M[i][j];
		}
	}
	
	if (escolha == 'S')
		printf("%.1f\n", soma);
	else if (escolha == 'M')
		printf("%.1f\n", soma / 12);
	
	return 0;
}