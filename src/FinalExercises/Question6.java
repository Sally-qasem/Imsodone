package FinalExercises;

public class Question6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int b = 1; b <= 10; b++) {
                int number = i * b;
                System.out.println(i + "*" + b + "=" + number);
                System.out.println();
            }
        }
    }
}
