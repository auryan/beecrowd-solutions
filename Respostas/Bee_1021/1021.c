#include <stdio.h>

int main() {
	int troco, N100, N50, N20, N10, N5, N2;
	int M1r, M50, M25, M10, M5, M1c;
	double valor;
	
	scanf("%lf", &valor);
	
	troco = valor;
	
	// Notas
	N100  = valor / 100;
	troco = troco % 100;
	
	N50   = troco / 50;
	troco = troco % 50;
	
	N20   = troco / 20;
	troco = troco % 20;
	
	N10   = troco / 10;
	troco = troco % 10;
	
	N5	= troco / 5;
	troco = troco % 5;
	
	N2	= troco / 2;
	
	//Moedas	
	M1r   = troco % 2;
	
	troco = (valor * 100) - ((int)valor * 100); // Passando os valores para inteiro
	
	M50   = troco / 50;
	troco = troco % 50;
	
	M25   = troco / 25;
	troco = troco % 25;
	
	M10   = troco / 10;
	troco = troco % 10;
	
	M5	= troco / 5;
	
	M1c   = troco % 5;
	
	printf("NOTAS:\n");
	printf("%d nota(s) de R$ 100.00\n", N100);
	printf("%d nota(s) de R$ 50.00\n", N50);
	printf("%d nota(s) de R$ 20.00\n", N20);
	printf("%d nota(s) de R$ 10.00\n", N10);
	printf("%d nota(s) de R$ 5.00\n", N5);
	printf("%d nota(s) de R$ 2.00\n", N2);
	
	printf("MOEDAS:\n");
	printf("%d moeda(s) de R$ 1.00\n", M1r);
	printf("%d moeda(s) de R$ 0.50\n", M50);
	printf("%d moeda(s) de R$ 0.25\n", M25);
	printf("%d moeda(s) de R$ 0.10\n", M10);
	printf("%d moeda(s) de R$ 0.05\n", M5);
	printf("%d moeda(s) de R$ 0.01\n", M1c);
	
	return 0;
}