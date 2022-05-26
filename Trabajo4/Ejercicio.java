package Trabajo4;

import java.util.Scanner;

public class Ejercicio {
    static Scanner lt=new Scanner(System.in);
    public static void ejercicio() {
        Scanner lt = new Scanner(System.in);


		System.out.print("Ingrese valor: ");
		int valor = lt.nextInt();
		for (int f=1; f<= valor; f++) {
			for (int c = 1; c<= valor; c++)
				System.out.print("*");
			
			System.out.println();
		}

	}
    
    
    public static void main(String[] args) {
        ejercicio();
    }

}
