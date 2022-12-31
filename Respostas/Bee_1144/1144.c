#include <stdio.h>

int main() {
	int N;
	int A = 1, B = 1, C = 1;
	
	scanf("%d", &N);
	
	printf("%d %d %d\n", A, B, C);
	
	for (int i = 1; i != N; i++) {
		B++; C++;
		
		printf("%d %d %d\n", A, B, C);
		
		B = B + (A + A);
		A++;
		C = A * B;
		
		printf("%d %d %d\n", A, B, C);
	}
	
	printf("%d %d %d\n", A, B += 1, C += 1);
	
	return 0;
}