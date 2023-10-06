import java.util.Scanner;

// Am assuming that i have coins of:
// Ten Rupee
// Five Rupee
// Two Rupee
// One Rupee

public class ChangeCalculator {
    public static void main(String[] args) {
        // Declaring the variables
        int totalAmount, chargedAmount, changeAmount;

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt for total amount
        System.out.print("Enter Total Amount: ");
        totalAmount = scanner.nextInt();

        // Validate user input
        if (totalAmount < 0) {
            System.out.println("Invalid Amount!");
            return;
        }

        // Prompt for Charged amount
        System.out.print("Enter Charged Amount: ");
        chargedAmount = scanner.nextInt();

        // Validate user input
        if (chargedAmount < 0) {
            System.out.println("Invalid Amount!");
            return;
        }

        changeAmount = totalAmount - chargedAmount;

        // Calculate the coins of ten_rupee
        int tenRupee = calculateTenRupee(changeAmount);
        changeAmount = changeAmount - tenRupee * 10;

        // Calculate the coins of five_rupee
        int fiveRupee = calculateFiveRupee(changeAmount);
        changeAmount = changeAmount - fiveRupee * 5;

        // Calculate the coins of two_rupee
        int twoRupee = calculateTwoRupee(changeAmount);
        changeAmount = changeAmount - twoRupee * 2;

        // Calculate the coins of one_rupee
        int oneRupee = calculateOneRupee(changeAmount);
        changeAmount = changeAmount - oneRupee * 1;

        // Sum all of the coins
        int totalCoins = tenRupee + fiveRupee + twoRupee + oneRupee;

        // Print the sum of coins
        System.out.println("Total Coins: " + totalCoins);
    }

    // Method to calculate ten_rupee coins
    static int calculateTenRupee(int total) {
        int ten = 0;
        while (total >= 10) {
            total = total - 10;
            ten++;
        }
        return ten;
    }

    // Method to calculate five_rupee coins
    static int calculateFiveRupee(int total) {
        int five = 0;
        while (total >= 5) {
            total = total - 5;
            five++;
        }
        return five;
    }

    // Method to calculate two_rupee coins
    static int calculateTwoRupee(int total) {
        int two = 0;
        while (total >= 2) {
            total = total - 2;
            two++;
        }
        return two;
    }

    // Method to calculate one_rupee coins
    static int calculateOneRupee(int total) {
        int one = 0;
        while (total >= 1) {
            total = total - 1;
            one++;
        }
        return one;
    }
}


// Example: //////////////////////////////
    // Total: 100
    // Charged: 42
    // Change: 58
    
    // Total Coins: 8
    // Ten : 5 coins
    // five : 1 coin
    // two : 1 coin
    // one : 1 coin
