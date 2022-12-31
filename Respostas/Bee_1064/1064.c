#include <stdio.h>

int main() {
	float A, B, C, D, E, F;
	int v_posi = 0;
	
	scanf("%f %f %f %f %f %f", &A, &B, &C, &D, &E, &F);
	
	if (A > 0) v_posi++;
	if (B > 0) v_posi++;
	if (C > 0) v_posi++;
	if (D > 0) v_posi++;
	if (E > 0) v_posi++;
	if (F > 0) v_posi++;
	
	printf("%d valores positivos\n", v_posi);
	
	if (A < 0) A = 0;
	if (B < 0) B = 0;
	if (C < 0) C = 0;
	if (D < 0) D = 0;
	if (E < 0) E = 0;
	if (F < 0) F = 0;
	
	printf("%.1f\n", (A + B + C + D + E + F) / v_posi);
	
	return 0;
}