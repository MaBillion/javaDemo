public class Final {
    static final Double PI = 3.14; // final 修饰的常量大写不可变
}

final class Demo1 {} // final 修饰的类不能被继承

class Demo2 {
    final void method() {} // final 修饰的方法不能被重写
}