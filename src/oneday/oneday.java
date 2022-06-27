package src.oneday;

public class oneday {
    String name;
    int age;

    public oneday(String name, int age) {
        this.name = name;       // this.name is the name of the variable
        this.age = age;         // this.age is the name of the variable
    }

    public static void main(String[] args) {
        test test = new test();     //调用test类的构造函数
//    test.funtest1();   //调用test类的funtest函数

//      test.funtest2();        //for增强版
        //       test.funtest3();        //字符串操作
               test.funtest4();        //读写
    }

}
