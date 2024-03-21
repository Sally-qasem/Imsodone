package FinalExercises;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = celsius * 9/5 + 32;
        System.out.println("Convert it to Fahrenheit: " + fahrenheit);

    }
}
