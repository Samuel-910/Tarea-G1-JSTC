package EXAMEN4;

import java.util.Scanner;

public class EJER2 { // Clase principal
    static Scanner lt = new Scanner(System.in);

    public static void numperfecto() {
        int i, j, suma;
        for (i = 1; i >= 1; i++) {
            suma = 0;
            for (j = 1; j < i; j++) {
                if (i % j == 0) {
                    suma = suma + j;
                }
            }
            if (i == suma) {
                System.out.println(i);
            }
        }
    }

    public static void imprimir() {
        int n;
        System.out.print("Introduce la Cantidad de numeros perfectos: ");
        n = lt.nextInt();
        while (n > 0) {
            for (int i = 1; i >= 1; i++) {
                int suma = 0;
                for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        suma = suma + j;
                    }
                }
                if (i == suma) {
                    System.out.println(i);
                }
            }
            n--;
        }
    }

    public static void main(String[] args) {
        imprimir();
    }
}