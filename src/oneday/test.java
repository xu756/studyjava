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

    public void funtest2() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int x : a) {
            System.out.println(x);
        }
    }

    public void funtest3() {
        String str = "hello world";
        System.out.println(str.length());
        System.out.println(str.charAt(0));
//        System.out.println(str.startsWith("hello"));
        int size = 10;
        int[] myList = new int[size];
        //写入数据
        for (int i = 0; i < size; i++) {
            myList[i] = i;
        }
        for (int x : myList) {
            System.out.println(x);
        }
    }
    public void funtest4() {
        
    }
}