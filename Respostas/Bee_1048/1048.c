#include <stdio.h>

int main() {
	double salario;
	
	scanf("%lf", &salario);
	
	if (salario > 0 && salario <= 400) {
		printf("Novo salario: %.2lf\n", (salario * 0.15)  + salario);
		printf("Reajuste ganho: %.2lf\n", salario * 0.15);
		printf("Em percentual: 15 %%\n");
	}
	
	else if (salario >= 400.01 && salario <= 800) {
		printf("Novo salario: %.2lf\n", (salario * 0.12) + salario);
		printf("Reajuste ganho: %.2lf\n", salario * 0.12);
		printf("Em percentual: 12 %%\n");
	}
		
	else if (salario >= 800.01 & salario <= 1200) {
		printf("Novo salario: %.2lf\n", (salario * 0.10) + salario);
		printf("Reajuste ganho: %.2lf\n", salario * 0.10);
		printf("Em percentual: 10 %%\n");
	}
			
	else if (salario >= 1200.01 & salario <= 2000) {
		printf("Novo salario: %.2lf\n", (salario * 0.07) + salario);
		printf("Reajuste ganho: %.2lf\n", salario * 0.07);
		printf("Em percentual: 7 %%\n");
	}
		
	else if (salario > 2000) {
		printf("Novo salario: %.2lf\n", (salario * 0.04) + salario);
		printf("Reajuste ganho: %.2lf\n", salario * 0.04);
		printf("Em percentual: 4 %%\n");
	}
	
	return 0;
}