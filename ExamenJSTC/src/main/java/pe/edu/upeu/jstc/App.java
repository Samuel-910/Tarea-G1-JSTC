package pe.edu.upeu.jstc;

import java.util.Scanner;

import pe.edu.upeu.jstc.Examen.ResolucionExamen;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        Scanner lt=new Scanner(System.in);
        int n;
        System.out.println("Ingrese el numero de algoritmo(2-5):");
        n=lt.nextInt();
        switch (n) {
            case 2: new ResolucionExamen().ejer2(); break;
            case 3: new ResolucionExamen().ejer3(); break;
            case 4: new ResolucionExamen().ejer4(); break;
            case 5: new ResolucionExamen().ejer5_1(); break;
            case 6: new ResolucionExamen().ejer6(); break;
            default: System.err.println("Esa opcion no existe"); break;
        }
    }
}
