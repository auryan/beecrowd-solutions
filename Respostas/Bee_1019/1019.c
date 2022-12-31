#include <stdio.h>

 int main() {
	int segundos, h, m, s;
	
	scanf("%d", &segundos);
	
	h = segundos / 3600;	
	m = (segundos % 3600) / 60;	
	s = (segundos % 3600) % 60;
	
	printf("%d:%d:%d\n", h, m, s);
	
	return 0;
}