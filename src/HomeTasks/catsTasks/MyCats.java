package HomeTasks.catsTasks;

import java.util.ArrayList;
import java.util.List;

public class MyCats {
    public static void main(String[] args) {
        List<Cat> mycatList = new ArrayList<>();

        Cat cat1 = new Cat();
        cat1.setName("Blake");
        cat1.setColor("Black");
        cat1.setAge(2);

        Cat cat2 = new Cat();
        cat2.setName("Cotton");
        cat2.setColor("White");
        cat2.setAge(1);

        Cat cat3 = new Cat();
        cat3.setName("Milo");
        cat3.setColor("gray");
        cat3.setAge(3);

        mycatList.add(cat1);
        mycatList.add(cat2);
        mycatList.add(cat3);

        printmycatsInformation(mycatList);
    }

    public static void printmycatsInformation(List<Cat> cats) {
        System.out.println("Cats Information-");
        System.out.println();
        for (Cat Cat : cats){
            System.out.println("Name: " + Cat.getName());
            System.out.println("Color- " + Cat.getColor());
            System.out.println("Age- " + Cat.getAge());
        }

    }
}
