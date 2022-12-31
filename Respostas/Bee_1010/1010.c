#include <stdio.h>

int main() {
	int codPe1, quantPe1;
	int codPe2, quantPe2;	
	float valorPe1, valorPe2;
	
	scanf("%d %d %f", &codPe1, &quantPe1, &valorPe1);
	scanf("%d %d %f", &codPe2, &quantPe2, &valorPe2);
	
	printf("VALOR A PAGAR: R$ %.2f\n", (quantPe1 * valorPe1) + (quantPe2 * valorPe2));
	
	return 0;
}