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