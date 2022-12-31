#include <stdio.h>

int main() {
	int codProd, quantProd;
	float total;
	
	scanf("%d %d", &codProd, &quantProd);
	
	switch (codProd) {
		case 1:
			total = 4.00 * quantProd;
			printf("Total: R$ %.2f\n", total);
			break;
			
		case 2:
			total = 4.50 * quantProd;
			printf("Total: R$ %.2f\n", total);
			break;
			
		case 3:
			total = 5.00 * quantProd;
			printf("Total: R$ %.2f\n", total);
			break;
			
		case 4:
			total = 2.00 * quantProd;
			printf("Total: R$ %.2f\n", total);
			break;
			
		case 5:
			total = 1.50 * quantProd;
			printf("Total: R$ %.2f\n", total);
			break;
	}
	
	return 0;
}