package HomeTasks;

public class ComparisonTask {
    public static void main(String[] args) {
        int a = 10;
        int b = 6;
        System.out.println(a < b);

        int c = 5;
        int d = 5;
        System.out.println(c >= d);

        int e = 20;
        int f = 10;
        System.out.println(e < f);

        int g = 35;
        int h = 50;
        System.out.println(g <= h);

        int i = 25;
        int j = 25;
        System.out.println(i == j);

        int k = 50;
        int l = 50;
        System.out.println(k != l);

        String word = "City";
        String wordd = "City";
        boolean compareStrings = word.equals(wordd);
        System.out.println("Are the two strings equal?" + compareStrings);

        String word1 = "City";
        String word2 = "citY";
        boolean comparestrings = word1.equalsIgnoreCase(word2);
        System.out.println("Are they also equal?" + comparestrings);
    }
}
