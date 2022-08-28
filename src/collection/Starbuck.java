package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Starbuck {
    public static void main(String[] args) {

        Map menu = new HashMap();

        List menuList = new ArrayList();
        menuList.add("Coffee");
        menuList.add("Ade");
        menuList.add("Tea");

        menu.put("Menu", menuList);

        List coffeeList = new ArrayList();
        coffeeList.add("Americano");
        coffeeList.add("Latte");
        coffeeList.add("Cold Brew");

        List adeList = new ArrayList();
        adeList.add("Lemonade");
        adeList.add("Mangoade");
        adeList.add("Cherryade");

        List teaList = new ArrayList();
        teaList.add("Hibiscus");
        teaList.add("Mint");
        teaList.add("Camomile");

        Map ade = new HashMap();
        Map coffee = new HashMap();
        Map tea = new HashMap();

        coffee.put("Coffee", coffeeList);
        ade.put("Ade", adeList);
        tea.put("Tea", teaList);

        System.out.println(menu);
        System.out.println(coffee);
        System.out.println(tea);
        System.out.println(ade);



    }
}
