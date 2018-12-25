public class Overload {

    // 有无参数
    public void test() {
        System.out.println("test1");
    }

    public int test(int a) {
        System.out.println("test2");
        return a + 1;
    }

    public void test(int a, String s) {
        System.out.println("test3");
    }

    public void test(String s, int a) {
        System.out.println("test4");
    }

    public static void main(String[] args) {
        Overload ol = new Overload();
        ol.test();
        ol.test(2);
        ol.test(3, "a");
        ol.test("b", 4);
    }
}

/*
重载(Overload)
重载(overloading) 是在一个类里面，方法名字相同，而参数不同。返回类型呢？可以相同也可以不同。

每个重载的方法（或者构造函数）都必须有一个独一无二的参数类型列表。

只能重载构造函数

重载规则

被重载的方法必须改变参数列表；
被重载的方法可以改变返回类型；
被重载的方法可以改变访问修饰符；
被重载的方法可以声明新的或更广的检查异常；
方法能够在同一个类中或者在一个子类中被重载。
*/