package Trabajo4;

import java.util.Scanner;

public class Ejercicio {
    static Scanner lt=new Scanner(System.in);
    public static void ejercicio() {
        //Definir variables
        int n,venta;
        double a=0,b=0,c=0,total=0,total1=0,total2=0,total3=0;
        //datos de entrada
        System.out.println("Ingresa el numero de ventas: ");
        n=lt.nextInt();
        while (n>0) {
            System.out.println("Ingresa el monto de la venta "+n);
            venta=lt.nextInt();
            if (venta>=20000){
			    a = a + 1;
			    total1 = total1+venta;
            }else if (venta>=10000 && venta<20000){
				b = b + 1;
				total2 = total2 + venta;
            }else{
				c = c + 1;
				total3 = total3 + venta;
            }
			total = total + venta;
		    n = n - 1;
       }
        System.out.println("El numero de ventas mayores a $20,000 es: "+a);
        System.out.println("El total de las ventas mayores a $20,000 es: "+total1);
	    System.out.println("El numero de ventas mayores a $10,000 y menores a $20,000 es: "+b);
	    System.out.println("El total de las ventas mayores a $10,000 y menores a $20,000 es: "+total2);
	    System.out.println("El numero de ventas menores a $10,000 es: "+c);
	    System.out.println("El total de las ventas menores a $10,000: "+total3);
	    System.out.println("El monto total de la ventas es: $"+total);
    }
    
    
    public static void main(String[] args) {
        ejercicio();
    }

}
