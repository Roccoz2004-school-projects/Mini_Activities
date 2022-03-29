package dev.rocco._basicClasses;

public class _test {
    public static QueryEvenOdd EvenOrOdd = new QueryEvenOdd();
    public static void main(String[] args) {
        int num = 6;
        if (EvenOrOdd.isOdd(num)) {
            System.out.println("Is even! epic");
        } else {
            System.out.println("not epic");
        }
    }
}
