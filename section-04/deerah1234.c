#include <stdio.h>
#include <stdlib.h>

int main() {
    // Clear console screen
    system("clear");
  
    // Create an integer variable for x
    int x;
    // Create an integer variable for y
    int y;

    // Ask the user "X: " and put the answer in x
    printf("Enter x: ");
    scanf("%d", &x);

    // Ask the user "Y: " and put the answer in y
    printf("\nEnter y: ");
    scanf("%d", &y);

    // Put x + y in sum
    int sum = x + y;

    // Tell the user "Answer is " sum
    printf("Answer is: %d\n", sum);

    // Compile and run the C program
    system("gcc -o my_program my_program.c");
    system("./my_program");
    system("rm my_program");

    return 0;
}
