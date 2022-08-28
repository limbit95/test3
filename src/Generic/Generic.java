package Generic;

public class Generic<abc> {

    abc[] v;

    public void set(abc[] n) {
        v = n;
    }

    public abc[] get() {
        return v;
    }

    public void print() {
        for (abc o : v) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

}
