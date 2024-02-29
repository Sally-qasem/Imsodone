package HomeTasks;

import java.util.Scanner;

public class CredentialsTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Username = "Sally";
        String Password = "1234";

        System.out.println("Please enter your username");
        String inputUsername = scanner.nextLine();
        System.out.println("Please enter your password");
        String inputPassword = scanner.nextLine();

        String message = (Username.equalsIgnoreCase(inputUsername) && Password.equalsIgnoreCase(inputPassword))
                ? "Welcome" + inputUsername.toLowerCase()
                : "Username or Password are incorrect.";
        System.out.println("Message- " + message);
    }
}
