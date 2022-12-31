#include <stdio.h>

int main() {
	int X;
	
	scanf("%d", &X);
	
	for (int i = 0; X >= i; i++) {
		if ((i % 2) == 1)
			printf("%d\n", i);
	}
	
	return 0;
}