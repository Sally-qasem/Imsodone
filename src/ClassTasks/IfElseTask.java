package ClassTasks;

import java.util.Scanner;

public class IfElseTask {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("this number is even");
        }
        else {
            System.out.println("this number is odd");
        }
    }
}
