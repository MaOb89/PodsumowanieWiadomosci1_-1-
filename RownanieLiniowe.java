package Zadania3006;

public class RownanieLiniowe {
    public static void main(String[] args) {
        double a1 = 2;
        int b = 2;
        int y = 0;

        //rownanie 0 = a*x+b to x = -b/a bo przy punkcie przeciecia z osia x y musi byc rowne 0
        double x = (-1 * b) / a1;

        //zeby proste byl prostopadle musi byc spelniony warunek a1 * a2 = -1;
        double a2 = -1/a1;

        System.out.println(x);
        System.out.println(a2);

    }
}
