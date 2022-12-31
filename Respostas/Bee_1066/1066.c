#include <stdio.h>

int main() {
	int number;
	int par = 0, impar = 0;
	int negativo = 0, positivo = 0;
	
	for (int i = 0; i < 5; i++) {
		scanf("%d", &number);
		
		if (number % 2 == 0)
			par++;
		else
			impar++;
			
		if (number >= 0)
			positivo++;
		else if (number < 0)
			negativo++;
	}
	
	printf("%d valor(es) par(es)\n%d valor(es) impar(es)\n", par, impar);
	printf("%d valor(es) positivo(s)\n%d valor(es) negativo(s)\n", positivo, negativo);
	
	return 0;
}