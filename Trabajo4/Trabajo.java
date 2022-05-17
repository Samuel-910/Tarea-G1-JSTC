package Trabajo4;

import java.util.Scanner;

/**
 * Trabajo
 */
public class Trabajo {

    static Scanner lt=new Scanner(System.in);

    public static void impuestoVehiculo418() {;
        //Definir variables
        int cantidad=0;
        double costV=0, impUnit=0, impTotal=0, totalimpV=0;
        //Datos de entrada y proceso y salida
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese Cantidad de vehiculos de categoria "+(i+1)+":");
            cantidad=lt.nextInt();
            System.out.println("Ingrese el precio de la categoria "+(i+1)+":");
            costV=lt.nextDouble();
            if(i==0){
                impUnit=costV*0.1;
            }else if (i==1) {
                impUnit=costV*0.07;
            }else{
                impUnit=costV*0.05;
            }

            impTotal=impUnit*cantidad;
            System.out.println("Impuesto de categoria "+(i+1)+"es:"+impUnit);
            System.out.println("Impuesto total de categoria "+(i+1)+"es:"+impTotal);
            totalimpV=totalimpV+impTotal;
        }
        System.out.println("Impuesto total de los vehiculos es: "+totalimpV);
    }
    public static void main(String[] args) {
        impuestoVehiculo418();
    }
}