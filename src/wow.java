import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class wow {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);

        cal2.set(2022, 7, 1);
        int[] my = new int[]{cal2.get(Calendar.YEAR), cal2.get(Calendar.MONTH), cal2.get(Calendar.DAY_OF_MONTH)};

//        System.out.println(cal2.get(Calendar.DAY_OF_WEEK));

//        if (cal2.get(Calendar.DAY_OF_WEEK) == 1){
//            System.out.println("Sun");
//        } else if ((cal2.get(Calendar.DAY_OF_WEEK) == 2)){
//            System.out.println("Mon");
//        } else if ((cal2.get(Calendar.DAY_OF_WEEK) == 3)){
//            System.out.println("Tue");
//        } else if ((cal2.get(Calendar.DAY_OF_WEEK) == 4)){
//            System.out.println("Wed");
//        } else if ((cal2.get(Calendar.DAY_OF_WEEK) == 5)){
//            System.out.println("Thu");
//        } else if ((cal2.get(Calendar.DAY_OF_WEEK) == 6)){
//            System.out.println("Fri");
//        } else if ((cal2.get(Calendar.DAY_OF_WEEK) == 7)){
//            System.out.println("Sat");
//        }


        System.out.println(cal2.get(Calendar.DAY_OF_WEEK));




    }
}
