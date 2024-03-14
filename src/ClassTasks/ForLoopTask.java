package ClassTasks;

import java.util.ArrayList;

public class ForLoopTask {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i <= 1000; i++){
            if (i % 5 == 0){
                System.out.println(i);
            sum += i;}
        }
        sum += arrayList.size();
        System.out.println("sum-" + sum);
    }
}
