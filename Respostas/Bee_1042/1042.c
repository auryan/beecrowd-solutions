#include <stdio.h>

int main() {
	int v1, v2, v3;
	
	scanf("%d %d %d", &v1, &v2, &v3);
	
	if (v1 < v2) {
		if (v2 < v3) {
			printf("%d\n%d\n%d\n", v1, v2, v3);
			printf("\n%d\n%d\n%d\n", v1, v2, v3);
		}
		
		else if (v1 < v3) {
			printf("%d\n%d\n%d\n", v1, v3, v2);
			printf("\n%d\n%d\n%d\n", v1, v2, v3);
		}
		
		else {
			printf("%d\n%d\n%d\n", v3, v1, v2);
			printf("\n%d\n%d\n%d\n", v1, v2, v3);
		}
	}
	
	else if (v2 < v3) {
		if (v1 < v3) {
			printf("%d\n%d\n%d\n", v2, v1, v3);
			printf("\n%d\n%d\n%d\n", v1, v2, v3);
		}
		
		else {
			printf("%d\n%d\n%d\n", v2, v3, v1);
			printf("\n%d\n%d\n%d\n", v1, v2, v3);
		}
	}
	
	else {
		printf("%d\n%d\n%d\n", v3, v2, v1);
		printf("\n%d\n%d\n%d\n", v1, v2, v3);
	}
	
	return 0;
}