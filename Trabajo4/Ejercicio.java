package Trabajo4;

import java.util.Scanner;

public class Ejercicio {
    static Scanner lt=new Scanner(System.in);
    public static void ejercicio() {
        //Definir datos
        int n,salones,edad,suma=0,total=0,alumnos=0;
        //Datos de entrada
        System.out.println("Ingrese la cantidad de salones: ");
        salones=lt.nextInt();
        while (salones>0) {
            System.out.println("Ingrese la cantidad de alumnos: ");
            n=lt.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println("Ingrese la edad del alumno: "+(i+1));
                edad=lt.nextInt(); 
                suma=suma+edad;
            }
            System.out.println("El promedio del salon "+salones+" es: "+(suma/n)+" años");
            alumnos = alumnos + n;
            total = total + suma;
	        salones = salones - 1;
            suma=suma*0;
        }
        System.out.println("El promedio de toda la escuela es: "+(total/alumnos)+" años");
    }
    public static void main(String[] args) {
        ejercicio();
    }

}
