package Trabajo4;

import java.util.Scanner;

public class Clase {

    static Scanner lt=new Scanner(System.in);

    public static void graficarA() {
        System.out.println("Ingrese Altura de la letra: ");
        int cantF=lt.nextInt();
        System.out.println("Ingrese num fila para la linea: ");
        int num=lt.nextInt();
        int medio=cantF+1;
        for (int f = 1; f <= cantF; f++) {
            for (int c = 1; c <= 2*cantF+1; c++) {
                if (f==1 && medio==c ) {
                    System.out.print("*");
                } else if (c==medio-f && f>1) {
                    System.out.print("*");  
                } else if(c==medio+f && f>1){
                    System.out.print("*");
                } else if(f==num && c>=medio-f && c<=medio+f){
                    System.out.print("*");
                } else{
                    System.out.print("*");
                }         
            }
            System.out.print("\n");
        }
        System.out.println("");
    }


    public static void main(String[] args) {
        graficarA();
    }
}