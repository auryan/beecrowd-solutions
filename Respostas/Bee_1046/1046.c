#include <stdio.h>

int main() {
	int a, b, hora_min;
	
	scanf("%d %d", &a, &b);
	
	hora_min = (b * 60) - (a * 60);
	
	if (hora_min <= 0)
		hora_min += (24 * 60);
	
	printf("O JOGO DUROU %d HORA(S)\n", hora_min / 60);
	
	return 0;
}