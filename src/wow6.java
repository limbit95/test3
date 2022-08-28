public class wow6 {
    public static void main(String[] args) {

        InterfaceEx ie = (int x) -> 5*x*x+3*x+1;

        System.out.println(ie.twofunc(1));

    }
}

interface InterfaceEx {
    public int twofunc(int x);
}

// 2차 함수 공식 : 5*x**2 + 3*x + 1