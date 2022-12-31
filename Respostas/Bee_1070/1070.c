#include <stdio.h>

int main() {
	int X;
	
	scanf("%d", &X);
	
	for (int i = 0; i < 12; i++) {
		if ((X % 2) == 1)
			printf("%d\n", X);
			
		X++;
	}
	
	return 0;
}