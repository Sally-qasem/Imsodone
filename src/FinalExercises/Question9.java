package FinalExercises;

import java.util.Arrays;
import java.util.Scanner;

//public class Question9 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter 5 numbers: ");
//        int num1 = input.nextInt();
//        int sum = num1;
//
//        Scanner input2 = new Scanner(System.in);
//        int num2 = input.nextInt();
//        sum += num2;
//
//        Scanner input3 = new Scanner(System.in);
//        int num3 = input.nextInt();
//        sum += num3;
//
//        Scanner input4 = new Scanner(System.in);
//        int num4 = input.nextInt();
//        sum += num4;
//
//        Scanner input5 = new Scanner(System.in);
//        int num5 = input.nextInt();
//        sum += num5;
//        System.out.println("The sum of all the values is -" + sum);
//    }
//
//}
    //or

public class Question9 {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number- ");
            numbers[i] = input.nextInt();
        }
        for (int number : numbers){
            sum += number;
        }
        System.out.println("The sum of all numbers is- " + sum);
        System.out.println("The array is- " + Arrays.toString(numbers));
        }
    }
