package src.oneday;


public class test {
    public void funtest1() {
        int i = 1;
        while (i < 10) {
            for (int m = 1; m <= i; m++) {
                System.out.printf("%d + %d = %d \t", i, m, i + m);
            }
            System.out.println("\n");
            i++;
        }

    }
}