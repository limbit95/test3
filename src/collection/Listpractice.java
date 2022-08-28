package collection;

import java.util.ArrayList;
import java.util.List;

public class Listpractice {
    public static void main(String[] args) {

        List list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add("happy");

//        for (int i = 0; i < list.size(); i++){
//            System.out.println(i + ":" + list.get(i));
//        }

        System.out.println(list.get(list.size() - 1));

    }
}
