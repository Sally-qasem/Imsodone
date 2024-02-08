package HomeTasks;

import java.util.Scanner;

public class HomeTaskScanner {
    public static void main(String[] args) {

// Scanner input = new Scanner(System.in)

// System.out.println("input first name");
// Scanner firstName = input.nextLine();

// System.out.println("input last name");
// Scanner lastName = input.nextLine();

        System.out.println("input first name");
        Scanner first_name = new Scanner(System.in);
        String name = first_name.nextLine(); // when you call a class and use it again and again on the same file/class you dont need to initate it every time. look at lines 8 - 14 how it should be wrriten.
        System.out.println("input last name");
        Scanner last_name = new Scanner(System.in);
        String lastName = last_name.nextLine();
        System.out.println("input city");
        Scanner cityName = new Scanner(System.in);
        String city = cityName.nextLine();
        System.out.println("input sumgrades");
        Scanner grade = new Scanner(System.in);
        String sumgrades = grade.nextLine();
        System.out.println("input age");
        Scanner myage = new Scanner(System.in);
        String my_age = myage.nextLine();

        }

    }

    //You did a GREAT JOB! and have an understanding of how to solve the questions. just remember the feedback I wrote.