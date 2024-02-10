package ClassTasks;

import java.util.Scanner;

public class ClockTasks {
    public static void main(String[]  args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Current time is:");
        int time = input.nextInt();
        int minutes = time % 100;
        int hours = time / 100;
        System.out.println(hours + ":" + minutes);
    }
}
