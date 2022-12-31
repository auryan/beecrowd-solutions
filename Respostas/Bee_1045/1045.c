#include <stdio.h>

int main() {
	float A, B, C, temp;
	
	scanf("%f %f %f", &A, &B, &C);
	
	if (A < B) {
		temp = A;
		A = B;
		B = temp;
	}
	
	if (B < C) {
		temp = B;
		B = C;
		C = temp;
	}
	
	if (A < B) { 
		temp = A;
		A = B;
		B = temp;
	}
	
	if (A >= (B + C))
		printf("NAO FORMA TRIANGULO\n");
	else if ((A * A) == (B * B) + (C * C))
		printf("TRIANGULO RETANGULO\n");
	else if ((A * A) > (B * B) + (C * C))
		printf("TRIANGULO OBTUSANGULO\n");
	else if ((A * A) < (B * B) + (C * C))
		printf("TRIANGULO ACUTANGULO\n");
	
	if (A == B && B == C)
		printf("TRIANGULO EQUILATERO\n");	
	else if ((A == B || A == C) || (B == C || B == A))
		printf("TRIANGULO ISOSCELES\n");
	
	return 0;
}