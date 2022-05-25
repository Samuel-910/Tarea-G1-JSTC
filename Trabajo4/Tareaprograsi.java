package Trabajo4;

import java.util.Scanner;

public class Tareaprograsi {
    static Scanner lt=new Scanner(System.in);
    public static void ejercicio2() {
        //Definir variables
        int n,tarjeta,hamburguesa;
        double total=0;
        //Datos de entrada
        System.out.println("Sencillo(1) \nDoble(2) \nTriple(3)");
        for (int i = 0; i < 3; i++) {
            hamburguesa=i+1;
            System.out.println("Ingrese la cantidad de hamburguesas del tipo "+(i+1)+":");
            n=lt.nextInt();
            switch (hamburguesa) {
                case 1:total=total+10*n; break;
                case 2:total=total+12*n; break;
                case 3:total=total+14*n; break;
                default: break;
            }
        }
        System.out.println("Elige el tipo de pago: \n1.- Efectivo \n2.-Trajeta de credito");
        tarjeta=lt.nextInt();
        switch (tarjeta) {
            case 1:System.out.println("El total a pagar es de: "+total+" pesos"); break;
		    case 2:total=total+(total*0.05); System.out.println("El total a pagar es de: "+total+" pesos"); break;
            default: break;
        }
    }
    
    public static void main(String[] args) {
        ejercicio2();
    }

}
