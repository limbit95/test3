package collection;

import java.sql.Array;
import java.util.*;

public class HashMapPractice {
    public static void main(String[] args) {

        List lolList = new ArrayList();

        Map top = new HashMap();
        Map jungle = new HashMap();
        Map mid = new HashMap();
        Map sp = new HashMap();
        Map ad = new HashMap();

        Set setTop = new HashSet();
        Set setJungle = new HashSet();
        Set setMid = new HashSet();
        Set setSp = new HashSet();
        Set setAd = new HashSet();

        lolList.add(top);
        lolList.add(jungle);
        lolList.add(mid);
        lolList.add(sp);
        lolList.add(ad);

        setTop.add("Garen");
        setTop.add("Galio");
        setTop.add("Nasus");

        setJungle.add("Gragas");
        setJungle.add("Nunu");
        setJungle.add("Nocturn");

        setMid.add("Diana");
        setMid.add("Lucian");
        setMid.add("Ari");

        setSp.add("Nami");
        setSp.add("Reona");
        setSp.add("Notilus");

        setAd.add("Draven");
        setAd.add("Vain");
        setAd.add("Ashe");

        top.put("TOP", setTop);
        jungle.put("JUNGLE", setJungle);
        mid.put("MID", setMid);
        sp.put("SP", setSp);
        ad.put("AD", setAd);

        for (int i = 0; i < lolList.size(); i++){
            System.out.println(lolList.get(i));
        }


    }
}
