package Loops;

import java.util.Scanner;

public class ForLoopMain {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ForLoop obj = new ForLoop(); // Create object of ForLoop class

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println();

        // Execution for even numbers
        obj.printEvenNumbers(num);

        // Execution for sum of natural numbers
        obj.sumOfNaturalNumbers(num);

        // Execution for squares of numbers
        obj.printSquares(num);

        sc.close();
    }
}
