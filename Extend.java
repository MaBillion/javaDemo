public class Extend {
    public static void main(String[] args) {
        Children c = new Children();
        c.speak();
    }
}

class Person {
    int age;
    String name;
}

class Father extends Person {

    String family;

    Father() {
        this.family = "堂吉诃德";
        this.name = "Jack";
        this.age = 30;
    }

    void speak() {
        System.out.println("我叫" + name + ",今年" + age + ",是" + family + "家族");
    }

}

class Children extends Father {
    // 无此构造函数打印的是父类的名字和年龄，有打印的是子类的
    Children() {
        this.name = "Bob";
        this.age = 6;
    }

    // 子类要覆盖父类的方法权限要大于或等于父类
    // void speak() {
    //     System.out.println("我叫" + name + ",今年" + age + ",是" + family + "家族");
    // }
}