package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class wow3 {
    public static void main(String[] args) {

        Map subway = new HashMap();

        List subwayList = new ArrayList();

        subwayList.add("Line 1");
        subwayList.add("Line 2");
        subwayList.add("Line 3");

        subway.put("KR Subway Route", subwayList);

        Map line1 = new HashMap();
        Map line2 = new HashMap();
        Map line3 = new HashMap();

        List line1List = new ArrayList();
        List line2List = new ArrayList();
        List line3List = new ArrayList();

        line1List.add("Cityhall");
        line1List.add("Yongsan");
        line1List.add("Dongdaemoon");

        line2List.add("Dangsan");
        line2List.add("Hapjeong");
        line2List.add("Shindorim");

        line3List.add("Bulgwang");
        line3List.add("Yonshinae");
        line3List.add("Jongno3ga");

        line1.put("Line1", line1List);
        line2.put("Line2", line2List);
        line3.put("Line3", line2List);

        Map cityhalltrans = new HashMap();
        cityhalltrans.put(line1List.get(0), "Line1");
        cityhalltrans.put(line1List.get(0), "Line2");
        Map yongsantrans = new HashMap();
        yongsantrans.put(line1List.get(1), "Line1");
        yongsantrans.put(line1List.get(1), "Line gyounghee");
        Map dongdaemoontrans = new HashMap();
        dongdaemoontrans.put(line1List.get(2), "Line1");
        dongdaemoontrans.put(line1List.get(2), "Line2");

        Map dangsantrans = new HashMap();
        dangsantrans.put(line2List.get(0), "Line2");
        dangsantrans.put(line2List.get(0), "Line9");
        Map hapjeongtrans = new HashMap();
        hapjeongtrans.put(line2List.get(1), "Line2");
        hapjeongtrans.put(line2List.get(1), "Line6");
        Map shindorimtrans = new HashMap();
        shindorimtrans.put(line2List.get(2), "Line2");
        shindorimtrans.put(line2List.get(2), "Line1");

        Map Bulgwangtrans = new HashMap();
        Bulgwangtrans.put(line3List.get(0), "Line3");
        Bulgwangtrans.put(line3List.get(0), "Line6");
        Map yonshinaetrans = new HashMap();
        yonshinaetrans.put(line3List.get(1), "Line3");
        yonshinaetrans.put(line3List.get(1), "Line6");
        Map jongno3gatrans = new HashMap();
        jongno3gatrans.put(line3List.get(2), "Line3");
        jongno3gatrans.put(line3List.get(2), "Line1");
        jongno3gatrans.put(line3List.get(2), "Line6");

        System.out.println();







    }
}
