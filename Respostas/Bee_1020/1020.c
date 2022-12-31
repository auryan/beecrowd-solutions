#include <stdio.h>

 int main() {
	int dias, a, m, d;
	
	scanf("%d", &dias);
	
	a = dias / 365;	
	m = (dias % 365) / 30;	
	d = (dias % 365) % 30;
	
	printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", a, m, d);
	
	return 0;
}