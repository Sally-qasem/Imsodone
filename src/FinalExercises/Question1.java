package FinalExercises;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hi, What is your age?");
        int age = input.nextInt();
        System.out.println("Well,now I know you are " + age + " years old!");
    }
}
