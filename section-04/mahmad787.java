import java.util.Scanner;

class main {
    public static void main(String[] args) {
        // Declare x
        int x;
        // Declare y
        int y;
        // Declare sum
        int sum;
        
        // Create object for scanner
        Scanner input_x = new Scanner(System.in);
        Scanner input_y = new Scanner(System.in);
        
        // Prompt for x
        System.out.println("Enter x: ");
        x = input_x.nextInt();
        
        // Prompt for y
        System.out.println("Enter y: ");
        y = input_y.nextInt();
        
        // Calculate sum
        sum = x + y;
        
        // Print the Sum
        System.out.println("x + y = " + sum);
        
        // Close the scanner object
        input_x.close();
        input_y.close();
    }
}
