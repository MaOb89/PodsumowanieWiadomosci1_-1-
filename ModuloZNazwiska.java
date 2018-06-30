package Zadania3006;

public class ModuloZNazwiska {
    public static void main(String[] args) {


        String imie = "marzena obara";
        char[] cArray = imie.toCharArray();
        char[] alphabet = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n'
                , 'o', 'q', 'r', 's', 't', 'u', 'w', 'x', 'y', 'z'};
        int[] tablica;
        int suma = 0;

        for (int ii = 0; ii < cArray.length; ii++) {
            for (int jj = 0; jj < alphabet.length; jj++) {
                if (cArray[ii] == alphabet[jj]) {
                    suma = suma + jj;
                }
            }
        }
        System.out.println(suma);
        int modulo = suma%2;
        System.out.println(modulo);
    }
}