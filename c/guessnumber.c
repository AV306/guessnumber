// Old code

#include <stdio.h>
#include <stdbool.h>

int main(void) {
  int tries = 4;
  bool correct = false;
  const int number = rand() % 21;
  
  srand(time(NULL));
  
  for (int i =0; i < tries; i++) {
  	
  	printf("Guess: ");
  	
  	int guess; scanf("%d", &guess);
  	
  	if (guess == number) {
  		
  		printf("Yes\n");
  		correct = true;
  		break;
  		//return number;
  		
  	} else if (guess < number) {
  		printf("Low\n");
  	} else if (guess > number) {
  		printf("High\n");
  	}
  	
  	
  }
  
  if (!correct) {
  	printf("Number was: ");
  	printf("%d", number);
  }
  
  
  return 0;
}
