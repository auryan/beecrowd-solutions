#include <stdio.h>

int main() {
	int valor, N100, N50, N20, N10, N5, N2, N1;
	
	scanf("%d", &valor);
	
	N100 = valor / 100;
	N50  = (valor % 100) / 50;
	N20  = ((valor % 100) % 50) / 20;
	N10  = (((valor % 100) % 50) % 20) / 10;
	N5   = ((((valor % 100) % 50) % 20) % 10) / 5;
	N2   = (((((valor % 100) % 50) % 20) % 10) % 5) / 2;
	N1   = ((((((valor % 100) % 50) % 20) % 10) % 5) % 2);
	
	printf("%d\n", valor);
	
	printf("%d nota(s) de R$ 100,00\n", N100);
	printf("%d nota(s) de R$ 50,00\n", N50);
	printf("%d nota(s) de R$ 20,00\n", N20);
	printf("%d nota(s) de R$ 10,00\n", N10);
	printf("%d nota(s) de R$ 5,00\n", N5);
	printf("%d nota(s) de R$ 2,00\n", N2);
	printf("%d nota(s) de R$ 1,00\n", N1);
	
	return 0;
}