package ClassTasks;

import java.util.Scanner;

public class ArrayTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int num1 = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        int num2 = input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        int num3 = input3.nextInt();

        int[] numbers = {num1 , num2 , num3};

        int min = numbers[0];
        int max = numbers[0];
        int sum = numbers[0] + numbers[1] + numbers[2];

        if (numbers[1] < min) {
            min = numbers[1];
        }
        if (numbers[2] < min) {
            min = numbers[2];
        }
        if (numbers[1] > max) {
            max = numbers[1];
        }
        if (numbers[2] > max) {
            max = numbers[2];
        }
        double average = (double) sum / numbers.length;
        System.out.println("Minimum number:" + min);
        System.out.println("Maximum number:" + max);
        System.out.println("Average:" + average);
    }
}
