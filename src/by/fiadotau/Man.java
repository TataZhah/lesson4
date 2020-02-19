package by.fiadotau;

public class Man {

    String name;
    int hairLength;

    public Man() {
        System.out.println("Call default constructor");
    }

    public Man(String name) {
        System.out.println("Constructor with param " + name);
        this.name = name;
    }

    public Man(int hairLength) {
        this.hairLength = hairLength;
    }

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().maxMemory());
        System.out.println(Runtime.getRuntime().totalMemory());

        System.out.println("Declare variable");
        Man max;
        System.out.println("Init variable");
        max = new Man(); //first instance
        System.out.println(max);

        Man max2 = new Man(); //second instance
        System.out.println(max2);
        max2 = max;
        System.out.println(max2);

        Man superman = new Man("Superman");
        System.out.println(superman.name);

        Man superman2 = new Man(123);
        System.out.println(superman2.hairLength);
        System.out.println(superman2.name);
    }
}