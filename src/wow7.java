import Generic.Generic;

public class wow7 {
    public static void main(String[] args) {

        // 정수 리스트 받고 그것의 평균 값

        Generic<Integer> gen = new Generic<Integer>();

        Integer[] numlist = {1, 2, 3, 4, 5};

        gen.set(numlist);
        gen.print();

    }
}
