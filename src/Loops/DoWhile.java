package Loops;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find sum of digits: ");
        int number = sc.nextInt();
        
        int sum = 0;
        int temp = number;

        // Do-while loop to calculate the sum of digits
        do {
            int digit = temp % 10;   // Extract last digit
            sum += digit;            // Add digit to sum
            temp /= 10;              // Remove last digit
        } while (temp != 0);

        System.out.println("Sum of digits of " + number + " is: " + sum);

        sc.close();
    }
}