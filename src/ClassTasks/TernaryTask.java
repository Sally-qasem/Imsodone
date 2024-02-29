package ClassTasks;

import java.util.Scanner;

public class TernaryTask {
    public static void main(String[] args) {
        double summary = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 numbers:");
        int number1 = input.nextInt();
        summary += number1;


        Scanner input2 = new Scanner(System.in);
        int number2 = input2.nextInt();
        summary += number2;

        Scanner input3 = new Scanner(System.in);
        int number3 = input3.nextInt();
        summary += number3;

        int Maximum = (number1 > number2) ? number1 : number2;
        int Minimum = (number1 < number2) ? number1 : number2;
        Maximum = (number3 > Maximum) ? number3 : Maximum;
        Minimum = (number3 < Minimum) ? number3 : Minimum;

        System.out.println("Maximum=" + Maximum);
        System.out.println("Minimum=" + Minimum);
        System.out.println("(Summary / 3.0)=" + (summary / 3.0));

    }
}
