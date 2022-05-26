package Trabajo4;

import java.util.Scanner;

public class Punto {
    static Scanner lt = new Scanner(System.in);
    public static void ejercicio1() {
       
        System.out.print("Introduzca numero de filas: ");
        int numFilas = lt.nextInt();
        System.out.print("Ingrese valor: ");
		int valor = lt.nextInt();
        int medio=numFilas+1;
        for(int altura = 1; altura<=numFilas; altura++){
            for(int blancos = 1; blancos<=numFilas-altura; blancos++){
                System.out.print(" ");
            }
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int f=1; f<= valor; f++) {
			for (int c = 1; c<= 2*valor+1; c++){
                if (f==1 && medio==c+1) {
                    System.out.print("*");
                }else if(f==1 && medio==c-1){
                    System.out.print("*");
                }else if(f==1 && medio==c+3){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
			System.out.println();
        }
	}

    public static void main(String[] args) {
        ejercicio1();
    }
}
