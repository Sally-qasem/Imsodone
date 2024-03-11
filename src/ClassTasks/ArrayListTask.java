package ClassTasks;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int sum = 0;

        System.out.println("Enter number 1:");
        int num1 = input.nextInt();
        sum += num1;

        System.out.println("Enter number 2:");
        int num2 = input.nextInt();
        sum += num2;

        System.out.println("Enter number 3:");
        int num3 = input.nextInt();
        sum += num3;

        input.close();

        arrayList.add(num1);
        arrayList.add(num2);
        arrayList.add(num3);
        System.out.println("arrayList=" + arrayList);
        System.out.println("sum=" + sum);

//   Calculating minimal, maximal and average numbers:
        int min = arrayList.get(0);
        int max = arrayList.get(0);

        if (arrayList.get(1) < min){
            min = arrayList.get(1);
        }
        if (arrayList.get(2) < arrayList.get(1)){
            min = arrayList.get(2);
        }
        if (arrayList.get(1) > max){
            max = arrayList.get(1);
        }
        if (arrayList.get(2) > max){
            max = arrayList.get(2);
        }
        double average = (double) sum / arrayList.size();
        System.out.println("Minimum:" + min);
        System.out.println("Maximum:" + max);
        System.out.println("Average:" + average);















    }
}
