#include <stdio.h>

int main() {	
	int tempoViagem, veloMedia, distancia;
	
	scanf("%d %d", &tempoViagem, &veloMedia);
	
	distancia = veloMedia * tempoViagem;
	
	printf("%.3f\n", (0.08333333333333333333333333333333 * distancia));
	
	return 0;
}