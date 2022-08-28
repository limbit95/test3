package collection;

import java.util.*;

public class Lineadd {


    Map subway = new HashMap();
    Set subwayList = new HashSet();
    Iterator it = null;

    public void lineAdd(int num) {
        subwayList.add("Line " + num);
        subway.put("KR Subway Line", subwayList);
    }

    public void lineAdd(String name) {
        subwayList.add("Line " + name);
        subway.put("KR Subway Line", subwayList);
    }

    public void showList(){
        it = subwayList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            it.remove();
        }
    }


}
