package HomeTasks;

import java.util.Scanner;

public class CreditCardTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cardnum = 12345678;
        String password = "abcd";

        for (int i = 0; i < 5; i++);
        System.out.println("Enter your Credit Card Number-");
        int cardnumInput = input.nextInt();
        input.nextLine();
        System.out.println("Enter your password-");
        String passwordInput = input.nextLine();

        if (cardnumInput == cardnum && passwordInput.equals(password)) {
            System.out.println("Welcome to your account!");
            return;
        } else {
            System.out.println("Something is wrong! Try again.");
            System.out.println("You have" + (i) + "attempts left.");
        }
        System.out.println("You have no attempts left. Your account is blocked.");
    }
}
