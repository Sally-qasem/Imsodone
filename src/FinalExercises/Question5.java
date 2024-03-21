package FinalExercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int startnum = input.nextInt();
        System.out.println("Enter the last number: ");
        int endnum = input.nextInt();
        System.out.println("Enter the first dividing number: ");
        int divnum1 = input.nextInt();
        System.out.println("Enter the second dividing number: ");
        int divnum2 = input.nextInt();

        for (int i = startnum; i<= endnum; i++){
        if (i % divnum1 == 0 && i % divnum2 == 0);
            System.out.println(i);
        }
    }
}
