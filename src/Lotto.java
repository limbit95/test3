import java.util.Random;

public class Lotto {
    public static void main(String[] args) {

        int[] lst = new int[6];
        Random r = new Random();

        for (int i = 0; i < lst.length; i++){
            lst[i] = r.nextInt(45) + 1;
            for (int x = 0; x < i; x++){
                if(lst[x] == lst[i]) i--;
            }
        }

        for (int i = 0; i < lst.length; i++){
            System.out.print(lst[i] + " ");
        }

    }
}