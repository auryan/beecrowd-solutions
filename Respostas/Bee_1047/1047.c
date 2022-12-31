#include <stdio.h>

int main() {
	int a, b, c, d, hora_min;
	
	scanf("%d %d %d %d", &a, &c, &b, &d);
	
	hora_min = ((b * 60) + d) - ((a * 60) + c);
	
	if (hora_min <= 0)
		hora_min += (24 * 60);
	
	printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", hora_min / 60, hora_min % 60);
	
	return 0;
}