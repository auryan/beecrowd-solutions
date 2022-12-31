#include <stdio.h>

int main() {
	char nome[15];
	double salFixo, totalVendas, TOTAL;
	
	scanf("%s %lf %lf", nome, &salFixo, &totalVendas);
	
	TOTAL = salFixo + (totalVendas * 0.15);
	
	printf("TOTAL = R$ %.2f\n", TOTAL);
	
	return 0;
}