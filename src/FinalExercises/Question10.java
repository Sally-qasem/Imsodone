package FinalExercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Question10 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        int sum = 0;
//
//        System.out.println("Enter number 1- ");
//        int num1 = input.nextInt();
//        sum += num1;
//
//        System.out.println("Enter number 2- ");
//        int num2 = input.nextInt();
//        sum += num2;
//
//        System.out.println("Enter number 3- ");
//        int num3 = input.nextInt();
//        sum += num3;
//
//        System.out.println("Enter number 4- ");
//        int num4 = input.nextInt();
//        sum += num4;
//
//        System.out.println("Enter number 5- ");
//        int num5 = input.nextInt();
//        sum += num5;
//
//        input.close();
//        arrayList.add(num1);
//        arrayList.add(num2);
//        arrayList.add(num3);
//        arrayList.add(num4);
//        arrayList.add(num5);
//        System.out.println("The 5 numbers are: " + arrayList);
//        System.out.println("The average value is- " + sum/ 5);
//    }
//}

// or

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number- ");
            int number = input.nextInt();
            numbers.add(number);
            sum += number;
        }
        double average = (double) sum / numbers.size();
        System.out.println("The list of numbers are- " + numbers);
        System.out.println("The average value is- " + average);
    }
}