package collection;

import java.util.HashSet;
import java.util.Set;

public class Setpractice {
    public static void main(String[] args) {

        Set set = new HashSet();

        for (int i = 0; i < 10; i++){set.add(i + 1);}

        System.out.println(set);

        for (int i = 0; i < 10; i++){set.add(i + 1);}

        System.out.println(set);

        

    }
}
