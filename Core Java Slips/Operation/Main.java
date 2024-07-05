package java_Slips.Operation;

public class Main {
    public static void main(String[] args) {
        Arithmatic arth = new Arithmatic();
        Maximum maximums = new Maximum();

        float a = arth.addition(5,5);
        float b = arth.subtraction(5,5);
        System.out.println(a);
        System.out.println(b);

        int x = maximums.max(5,5);
        System.out.println(x);

    }
}
