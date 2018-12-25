public class Single {
    private Single() {}

    static Single s = new Single();

    public static Single getInstance() {
        return s;
    }
}