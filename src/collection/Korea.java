package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Korea {
    public static void main(String[] args) {

        List sity = new ArrayList();

        sity.add("Busan");
        sity.add("Cheonan");
        sity.add("Seoul");

        List seoulCounty = new ArrayList();
        seoulCounty.add("Gangnam");
        seoulCounty.add("Yongsan");

        List busanCounty = new ArrayList();
        busanCounty.add("Sahara");

        Map korea = new HashMap();
        korea.put("collection.Korea", sity);

        Map seoulMap = new HashMap();
        Map busanMap = new HashMap();

        for (int i = 0; i < sity.size(); i++){
            if (sity.get(i) == "Seoul"){
                seoulMap.put("Seoul", seoulCounty);
            } else if (sity.get(i) == "Busan"){
                busanMap.put("Busan", busanCounty);
            }
        }

        System.out.println(korea);
        System.out.println(seoulMap);
        System.out.println(busanMap);


    }
}
