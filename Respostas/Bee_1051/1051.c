#include <stdio.h>

int main() {
	double salario, taxa;
	
	scanf("%lf", &salario);
	
	if (salario > 0 && salario <= 2000)
		printf("Isento\n");
		
	else if (salario >= 2000.01 && salario <= 3000)
		printf("R$ %.2lf\n", (salario - 2000) * 0.08);
		
	else if (salario >= 3000.01 && salario <= 4500) {
		taxa = 1000 * 0.08;
		salario = (salario - 3000) * 0.18;
		printf("R$ %.2lf\n", salario + taxa);
	}
	
	else {
		taxa = (1000 * 0.08) + (1500 * 0.18);
		salario = (salario - 4500) * 0.28;
		printf("R$ %.2lf\n", salario + taxa);
	}
	
	return 0;
}