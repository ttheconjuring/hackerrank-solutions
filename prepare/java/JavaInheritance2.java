package prepare.java;

public class JavaInheritance2 {

    static class Arithmetic {
        int add(int a, int b) {
            return a + b;
        }
    }

    static class Adder extends Arithmetic {}

    public static void main(String[] args) {

        Arithmetic adder = new Adder();
        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getSimpleName());
        System.out.printf("%d %d %d", adder.add(21, 21), adder.add(5, 8), adder.add(11, 9));

    }

}
