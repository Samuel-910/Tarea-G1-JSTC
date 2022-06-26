package EXAMEN4;

import java.util.Scanner;

public class EJER2 { // Clase principal
    static Scanner lt = new Scanner(System.in);

    public static void numperfecto() {
        System.out.println("---------------->Ejercicio4<----------------");

        int i, j, suma, sec = 0;
        System.out.println("Ingrese cuantos numeros perfectos desea ver (dentro del rango): ");
        int canti = lt.nextInt();
        System.out.println("→→→→→→→→☻Los numero perfectos son:☻←←←←←←←→");
        for (i = 1; i > 0; i++) {

            suma = 0;
            for (j = 1; j < i; j++) {
                if (i % j == 0) {
                    suma = suma + j;
                }
            }
            if (i == suma) {

                sec++;
                if (sec <= canti) {
                    System.out.println(i);
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        numperfecto();
    }
}