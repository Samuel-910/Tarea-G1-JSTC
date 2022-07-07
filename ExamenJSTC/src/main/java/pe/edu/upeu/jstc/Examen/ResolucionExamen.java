package pe.edu.upeu.jstc.Examen;

import java.util.Scanner;

public class ResolucionExamen {
    static Scanner lt = new Scanner(System.in);

    public void ejer2() {
        // Definir variables
        int cantidad = 0;
        double costV = 0, impUnit = 0, impTotal = 0, totalimpV = 0;
        // Datos de entrada y proceso y salida
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese Cantidad de vehiculos de categoria " + (i + 1) + ":");
            cantidad = lt.nextInt();
            System.out.println("Ingrese el precio de la categoria " + (i + 1) + ":");
            costV = lt.nextDouble();
            if (i == 0) {
                impUnit = costV * 0.12;
            } else if (i == 1) {
                impUnit = costV * 0.08;
            } else {
                impUnit = costV * 0.05;
            }

            impTotal = impUnit * cantidad;
            System.out.println("Impuesto de categoria " + (i + 1) + "es:" + impUnit);
            System.out.println("Impuesto total de categoria " + (i + 1) + "es:" + impTotal);
            totalimpV = totalimpV + impTotal;
        }
        System.out.println("Impuesto total de los vehiculos es: " + totalimpV);
    }

    public void ejer3() {
        int h = 0;
        System.out.print("Introduce la altura (debe ser impar y mayor o igual de 3): ");
        h = lt.nextInt();
        if (h % 2 == 1 && h>=3) {
            for (int fil = 1; fil <= h; fil++) {
                for (int col = 1; col <= h; col++) {
                    if ((fil == col) || (col == (h - fil) + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("ERROR: Numero no aceptado");
        }
    }

    public void ejer4() {
        int i, j, suma, sec = 0;
        System.out.println("Ingrese cuantos numeros perfectos desea ver : ");
        int canti = lt.nextInt();
        System.out.println("Los numero perfectos son: ");
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
    
    public void ejer5_1() {
        int n;
        do {
            System.out.print("Introduzca numero >0: ");
            n = lt.nextInt();
        } while (n < 0);
        System.out.print("Binario: ");
        ejer5_2(n);
    }

    public static void ejer5_2(int n) {
        if (n < 2) {
            System.out.print(n);
            return;
        } else {
            ejer5_2(n / 2);
            System.out.print(n % 2);
            return;
        }
    }

    public void ejer6() {
        System.out.println("Profesor no me desapruebe :( \n Tenga piedad :)");
    }
}
