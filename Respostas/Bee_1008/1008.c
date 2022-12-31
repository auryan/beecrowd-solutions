#include <stdio.h>

int main() {
	int NUMBER, quantHorasTrab;
	float SALARY, valorHora;
	
	scanf("%d %d %f", &NUMBER, &quantHorasTrab, &valorHora);
	
	SALARY = valorHora * quantHorasTrab;
	
	printf("NUMBER = %d\n", NUMBER);
	printf("SALARY = U$ %.2f\n", SALARY);
	
	return 0;
}