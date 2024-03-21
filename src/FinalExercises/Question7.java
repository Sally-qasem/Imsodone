package FinalExercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Please provide an integer value or 0 to terminate: ");
            int i = input.nextInt();
            if (i == 0) {
                break;
            }
            if (i < min){
                min = i;
            }
            if (i > max){
                max = i;
            }
        }
        System.out.println("Min value provided: " + min);
        System.out.println("Max value provided: " + max);
    }
}

