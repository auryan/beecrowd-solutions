#include <stdio.h>

int main() {
	float AV1, AV2;
	
	do {
		scanf("%f", AV1);
		
		if ((AV1 < 0) || (AV1 > 10))
			printf("nota invalida\n");
	}
	while ((AV1< 0) || (AV1> 10));
	
	do {
		scanf("%f", AV2);
		
		if ((AV2 < 0) || (AV2 > 10))
			printf("nota invalida\n");
	}
	while ((AV2 < 0) || (AV2 > 10));
	
	printf("media = %.2f\n", (AV1 + AV2) / 2);
	
	return 0;
}