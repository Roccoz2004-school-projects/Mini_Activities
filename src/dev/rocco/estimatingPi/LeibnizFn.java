package dev.rocco.estimatingPi;

public class LeibnizFn {
    public static void main(String[] args) {
        double pi;
        double denominator = 1;
        double temp = 0;

        for (int i = 0; i < 1000000; i++) {
            if (i % 2 == 0) {
                temp += (1/denominator);
            } else {
                temp -= (1/denominator);
            }
            denominator += 2;
        }
        pi = temp * 4;
        System.out.println(pi);
    }
}
