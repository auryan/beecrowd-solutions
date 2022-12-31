#include <stdio.h>

int main() {
	char animal_type[20], classe[20], feed[20];
	
	scanf("%s %s %s", animal_type, classe, feed);
	
	if (animal_type[0] == 'v' && classe[0] == 'a' && feed[0] == 'c') printf("aguia\n");
	if (animal_type[0] == 'v' && classe[0] == 'a' && feed[0] == 'o') printf("pomba\n");
	
	if (animal_type[0] == 'v' && classe[0] == 'm' && feed[0] == 'o') printf("homem\n");
	if (animal_type[0] == 'v' && classe[0] == 'm' && feed[0] == 'h') printf("vaca\n");
	
	if (animal_type[0] == 'i' && classe[0] == 'i' && feed[2] == 'm') printf("pulga\n");
	if (animal_type[0] == 'i' && classe[0] == 'i' && feed[2] == 'r') printf("lagarta\n");
	
	if (animal_type[0] == 'i' && classe[0] == 'a' && feed[0] == 'h') printf("sanguessuga\n");
	if (animal_type[0] == 'i' && classe[0] == 'a' && feed[0] == 'o') printf("minhoca\n");
	
	return 0;
}