package Loops;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        int temp = n;

        // while loop to calculate sum of digits
        while (temp != 0) {
            int digit = temp % 10;   // extract last digit
            sum += digit;            // add to sum
            temp = temp / 10;        // remove last digit
        }

        System.out.println("The sum of digits of " + n + " is: " + sum);

        sc.close();
    }
}
