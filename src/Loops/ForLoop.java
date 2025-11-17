package Loops;

public class ForLoop {

    // Method to print even numbers up to n
    public void printEvenNumbers(int n) {
        System.out.println("Even numbers up to " + n + ":");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    // Method to find the sum of natural numbers up to n
    public void sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of first " + n + " natural numbers: " + sum);
        System.out.println();
    }

    // Method to print squares of numbers from 1 to n
    public void printSquares(int n) {
        System.out.println("Squares of numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.println("Square of " + i + " = " + (i * i));
        }
        System.out.println();
    }
}
