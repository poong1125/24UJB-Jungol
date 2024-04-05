package q617;

import java.util.Scanner;

class Person {
    String name;
    int height;

    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person s = null;

        for (int i = 0; i < 5; i++) {
            String name = sc.next();
            int height = sc.nextInt();

            Person c = new Person(name, height);

            if (s == null || c.height < s.height) {
                s = c;
            }
        }

        System.out.println(s.name + " " + s.height);
        sc.close();
    }
}
