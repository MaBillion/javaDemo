public class VirtualDemo {
    public static void main(String[] args) {
        Salary s = new Salary("Mohd", "Ambehta", 3, 3600.00);
        Employee e = new Salary("John", "Boston", 2, 2400.00);
        System.out.println("Call mailCheck using Salary reference --");
        s.checkMail();
        System.out.println("\n Call mailCheck using Employee reference--");
        e.checkMail();
    }
}