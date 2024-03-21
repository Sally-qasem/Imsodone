package FinalExercises;

import java.util.Calendar;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hi, What is your age?");
        int age = input.nextInt();
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int yearofbirth = age - year;
        System.out.println("That means you were born in " + yearofbirth);
        int future = age + 20;
        System.out.println("This means that in 20 years you will be " + future + " years old!");
    }
}
