package loopingstatements;

import java.util.Scanner;
/*Write a program that displays a menu with options 1. Add 2. Sub Based on the options chosen, read 2 numbers
 and perform the relevant operation. After performing the operation, the program should ask the user if he wants to continue.
 If the user presses y or Y, then the program should continue displaying the menu else the program should terminate. [ Note: Use Scanner class]*/


public class Assignment11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Add\n2. Sub");
        int choice = sc.nextInt();

        int operand1;
        int operand2;
        int result;

        if (choice == 1) {
            System.out.println("Enter first operand: ");
            operand1 = sc.nextInt();
            System.out.println("Enter second operand: ");
            operand2 = sc.nextInt();
            result = operand1 + operand2;
        } else {
            System.out.println("Enter first operand: ");
            operand1 = sc.nextInt();
            System.out.println("Enter second operand: ");
            operand2 = sc.nextInt();
            result = operand1 - operand2;
        }

        System.out.println("Result: " + result);

        System.out.println("Do you want to continue? Y or N");

        sc.nextLine();
        choice = sc.nextLine().charAt(0);

        if (choice == 'Y' || choice == 'y') main(args);

        sc.close();
    }
}
