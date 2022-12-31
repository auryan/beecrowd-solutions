#include <stdio.h>
#include <stdlib.h>

int main() {
	int a, b, c, maiorAB, maiorABC;
	
	scanf("%d %d %d", &a, &b, &c);
	
	maiorAB = (a + b + abs(a - b)) / 2;
	maiorABC = (maiorAB + c + abs(maiorAB - c)) / 2;
	
	if (maiorABC == a)
		printf("%d eh o maior\n", a);
	else if (maiorABC == b)
		printf("%d eh o maior\n", b);
	else if (maiorABC == c)
		printf("%d eh o maior\n", c);
	
	return 0;
}