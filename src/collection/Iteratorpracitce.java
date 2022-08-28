package collection;

import com.sun.jdi.StringReference;

import java.util.*;

public class Iteratorpracitce {
    public static void main(String[] args) {

        Iterator it = null;

        List list = new ArrayList();
        Set set = new HashSet();

        for (int i = 1; i <= 5; i++){
            list.add(i);
        }

        set.add("IPAD");
        set.add("IPHONE");
        set.add("APPLE WATCH");
        set.add("MACBOOK");

        System.out.println(list);
        System.out.println(set);

//        it = list.iterator();
//
//        System.out.println("List Iterator");
//        System.out.println(it);
//
        it = set.iterator();
//        System.out.println("Set Iterator");
//        System.out.println(it);

        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        while (it.hasNext()) {
            if (it.next().equals(a)){
                System.out.println("good");
            }
        }

//        for (int i = 0; i < set.size(); i++){
//            System.out.println(set);
//        }

    }

//    private static void iteratorPrint(Iterator it) {
//        whlie (it.hasNext()) {
//            System.out.println(it.next());
//            it.remove();
//        }
//    }
}
