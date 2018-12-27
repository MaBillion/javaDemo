public class Encapsulation {
    private int age = 0;

    public int getAge () {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();

        e.setAge(18);
        System.out.println(e.getAge());
    }
}

class Employee {
    private String name;
    private String address;
    private int nummber;

    Employee(String name, String address, int number) {
        this.name = name;
        this.address = address;
        this.nummber = number;
    }

    public void checkMail() {
        System.out.println("Mailing a check to" + this.name + " " + this.address);
    }

    public String toString() {
        return this.name + " " + this.address + " " + this.nummber;
    }

    public String getName() {
        return this.name;
    }

    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    public int getNumber() {
        return this.nummber;
    }
}

class Salary extends Employee {
    private double salary;
    Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }

    public void checkMail() {
        System.out.println("Within mailCheck of Salary class ");
        System.out.println("Mailing check to " + getName()
        + " with salary " + this.salary);
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }

    public double computePay() {
        System.out.println("Computing salary pay for " + getName());
        return this.salary/2;
    }
}