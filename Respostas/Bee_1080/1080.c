#include <stdio.h>

int main() {
	int numero, posicao = 1;
	int maior_numero = 0, posicao_do_maior = 0;
	
	for (int i = 1; i <= 100; i++) {
		scanf("%d", &numero);
		
		if (maior_numero < numero) {
			maior_numero = numero;
			posicao_do_maior = i;
		}
	}
	
	printf("%d\n", maior_numero);
	printf("%d\n", posicao_do_maior);
	
	return 0;
}