package EstRepetitiva;

import java.util.Scanner;

/**
 * EjercicioRepit
 */
public class EjercicioR {
    static Scanner it=new Scanner(System.in);
    public static void imprimirWhileN1_20() {
        int numInit=21;
        while (numInit<=20) {
            System.out.println(numInit);
            numInit=numInit+1;
    }    
    }
    public static void imprimirDowhileN1_20() {
        int num1=21;
        do {
            System.out.println(num1);
            num1++;
        } while (num1<=20);
        
    }
    public static void imprimirForN1_20() {
        for (int num1=1;num1<=20;num1++) {
            System.out.println(num1);
        }
    }
    public static void nombrevertical() {
            String nombre;
            System.out.println("Ingrese su nombre: ");
            nombre=it.next();
            for (int i=nombre.length()-1;i>=0;i--) {
                System.out.println(nombre.charAt(i));
            }
        }
    public static void ejercicio41() {
        //Definir variables
        int contador=1;
        double numeroX;
        double sumaNumeros=0;
        //Proceso Datos de entrada
        while (contador<=10) {
            System.out.print("Ingrese el valor de "+contador+": ");
            numeroX=it.nextDouble();
            sumaNumeros=sumaNumeros+numeroX;
            contador++;
            System.out.println("");
        }
        //Datos de Salida
        System.out.println("La suma de los "+(contador-1)+" valores introducidos es: "+ sumaNumeros);
    }
    public static void ejercicio44() {
        //Definir Variables
        int cantfocoV=0, cantfocoB=0, cantfocoR=0;
        String colorF="";
        String continuar="S";
        //Datos de entrada y proceso
        while (continuar.equals("S")) {
            System.out.println("Ingrese el color de Foco:\nV=Verde\nB=Blanco\nR-Rojo");
            colorF=it.next().toUpperCase();
            if (colorF.charAt(0)=='V') {
                cantfocoV++;
            }else if (colorF.charAt(0)=='B') {
                cantfocoB++;
            } else if (colorF.charAt(0)=='R') {
                cantfocoR++;
            }else{
                System.err.println("No es correcto el color de foco");
            }

            System.out.println("Tiene mas focos a evaluar?:\nS=Si\tN=No");
            continuar=it.next().toUpperCase().equals("S")?"S":"N";
        }
        //Datos de salida
        System.out.println("La cantidad de focos de color Verde es: "+cantfocoV);
        System.out.println("La cantidad de focos de color Blanco es:" +cantfocoB);
        System.out.println("La cantidad de focos de color Rojo es: "+cantfocoR);
        System.out.println("La cantidad Total de focos son: "+(cantfocoV+cantfocoB+cantfocoR));

    }
    public static void ejercicio47() {
        //Definir Variables
        int cantNumMayorcero=0, cantNumMenorIgualCero=0;
        double numN=0;
        String continuar="S";
        //Datos de entrada y proceso
        while (continuar.equals("S")) {
            System.out.println("Ingrese un numero:");
            numN=it.nextDouble();
            if (numN<=0) {
                cantNumMenorIgualCero++;
            }else{
                cantNumMayorcero++;
            }
            System.out.println("Desea ingresar mas numeros?:\nS=Si\tN=No");
            continuar=it.next().toUpperCase().equals("S")?"S":"N";
        }  
        //Datos de salida
        System.out.println("Cantidad de numeros Mayores de cero: "+cantNumMayorcero);
        System.out.println("Cantidad de numeros menores e iguales a cero: "+cantNumMenorIgualCero);
        System.out.println("Total de numeros introducidos: "+(cantNumMayorcero+cantNumMenorIgualCero));
    }
    public static void ejercicio40() {
    //Definir Variables
    int  total=0,numInit=1,contador=1;
    //Proceso
    while (numInit<=20) {
        if (numInit%2==0) {
            total=total+numInit;
            contador = contador + 1;
        } else {
            numInit=numInit+1;
        }
    System.out.println("La suma total es: "+total);
    }
    }
   

    
    public static void main(String[] args) {
        //Definir variable
        int numero;
        System.out.println("Ingrese el numero del ejercicio que quiere ejecutar: ");
        numero=it.nextInt();
        switch (numero) {
            case 1: imprimirWhileN1_20(); break;
            case 2: imprimirDowhileN1_20(); break;
            case 3: imprimirForN1_20(); break;
            case 4: nombrevertical(); break;
            case 5: ejercicio41(); break;
            case 6: ejercicio44(); break;
            case 7: ejercicio47(); break;
            case 8: ejercicio40(); break;
            default: break;
        }
        
    }
}