package HomeTasks;

import java.util.ArrayList;
import java.util.Scanner;

public class WhileLoopTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        int sum = 0;
        int i = 0;
        while (i < 500) {
            if (i % 4 == 0) {
                if (i == 100) {
                    System.out.println("you have reached 100!");
                    break;
                }
                else i++;
                continue;
            }
            if (i % 7 == 0) {
                System.out.println("Number is divided by 7- " + i);
                sum += i;
            }
            i++;
        }
        System.out.println("sum-" + sum);
    }
    }




