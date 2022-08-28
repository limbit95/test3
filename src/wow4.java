import Generic.Generic;

public class wow4 {
    public static void main(String[] args) {

        Generic<String> gen = new Generic<String>();
        String[] ss = {"Hong gil dong", "Lee soon shin", "Kim you shin"};

        // String 제네릭 타입의 매개변수에 String 배열 객체 전달
        gen.set(ss);
        gen.print();

        for (String s : gen.get()) {
            System.out.println(s);
        }

        Integer[] ii = {1, 2, 3};

        Generic<Integer> gen2 = new Generic<Integer>();
        gen2.set(ii);
        gen2.print();

        for (Integer o : gen2.get()) {
            System.out.println(o);
        }
    }
}
