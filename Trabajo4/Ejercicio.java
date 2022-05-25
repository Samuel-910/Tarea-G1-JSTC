package Trabajo4;

import java.util.Scanner;

public class Ejercicio {
    static Scanner lt=new Scanner(System.in);
    public static void ejercicio() {
        //Definir variables
        int alumnos;
        double notas,reprovadas=0,aprovados=0,invalidos=0;
        //Datos de entrada
        System.out.println("Ingrese la cantidad de alumnos");
        alumnos=lt.nextInt();
        for (int i = 0; i < alumnos; i++) {
            System.out.println("Ingrese la nota del "+(i+1)+"(1-20):");
            notas=lt.nextInt();
            if (notas>20){
                invalidos=invalidos+1;
            }else if (notas>=14 && notas<=20) {
                aprovados=aprovados+1;
            }else {
                reprovadas=reprovadas+1;
            }
        }
        System.out.println("El total de alumnos aprobados es: "+aprobados);
	    System.out.println("El total de alumnos reprobados es: "+reprobados);
        System.out.println("El total de notas invalidas es: "+invalidos);
    }
    
    
    public static void main(String[] args) {
        ejercicio();
    }

}
