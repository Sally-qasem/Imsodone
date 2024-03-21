package FinalExercises;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name!");
        String words = input.nextLine();

        String reverse = "";
        for (int i = words.length() -1; i >= 0; i--){
            reverse += words.charAt(i);
            System.out.println(reverse);
        }
        System.out.println("This is your name in reverse- " + reverse);
    }
}
