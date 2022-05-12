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
        
    
    public static void main(String[] args) {
        /*System.out.println("Imprime While: "); imprimirWhileN1_20();
        System.out.println("Imprime Dowhile: "); imprimirDowhileN1_20();
        System.out.println("Imprime For: "); imprimirForN1_20();*/
        nombrevertical();
    }
}