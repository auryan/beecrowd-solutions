#include <stdio.h>
#include <math.h>

int main() {
	double A, raio, pi = 3.14159;
	
	scanf("%lf", &raio);
	
	A = pi * pow(raio, 2);
	
	printf("A=%.4lf\n", A);
	
	return 0;
}