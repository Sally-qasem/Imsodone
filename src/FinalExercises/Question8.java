package FinalExercises;

import java.util.Random;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNum = rand.nextInt(99) + 1;
        Scanner input = new Scanner(System.in);
        int attempts = 0;

        while (attempts < 7){
            System.out.println("Guess the number!");
            int i = input.nextInt();
            attempts++;
            if (i == randomNum) {
                System.out.println("Correct!");
            break;
            }

            else if (i > randomNum) {
                System.out.println("Larger...");
            } else {
                System.out.println("Smaller...");
            }
if (attempts == 7)
    System.out.println("You have reached your limit! Sorry. The number is- " + randomNum);

            }
        }
    }
