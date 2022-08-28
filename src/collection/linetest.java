package collection;

public class linetest {
    public static void main(String[] args) {

        Lineadd line = new Lineadd();

        line.lineAdd(1);
        line.lineAdd(2);
        line.lineAdd(3);
        line.lineAdd("Gyounghee");

        line.showList();

        System.out.println(line.subway);



    }
}
