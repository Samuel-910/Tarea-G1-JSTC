package Examen;

import java.util.Scanner;

/**
 * Examen
 */
public class Examen {
    //examen unidad 01 Jose Samuel Turpo Cauna

    static Scanner lt=new Scanner(System.in);

    public static void pregunta1JSTC() {
        //Definir Variables
        double EC, EP, TP, promedio;
        String estado;
        //Datos de Entrada
        System.out.println("Ingrese la nota de el examen de conocimientos: ");
        EC=lt.nextDouble();
        System.out.println("Ingrese la nota de la entrevista persona: ");
        EP=lt.nextDouble();
        System.out.println("Ingrese la nota del test psicologico: ");
        TP=lt.nextDouble();
        //Proceso
        promedio=EC*0.4+EP*0.25+TP*0.35;
        if (promedio>=17 && promedio<=20) {
            estado="\n\nAprobo \n\tSe encuentra en el nivel 4";
        }else if(promedio<17 && promedio>=14){
            estado="\n\nAprobo \n\tSe encuentra en el nivel 3";
        }else if(promedio<14 && promedio>=11){
            estado="\n\nAprobo \n\tSe encuentra en el nivel 2";
        }else if(promedio<11){
            estado="\n\nDesaprobo y pierde la vacante \n\tSe encuentra en el nivel 1";
        }else{
            estado="\n\nDesaprobado";
        }
        //Datos de salida
        System.out.println(estado);
    }
    public static void pregunta2JSTC() {
        //Definir variables
        double precio,igv,descuento,total,preFi;
        //Datos de entrada
        System.out.println("Ingrese el precio del articulo: ");
        precio=lt.nextDouble();
        //Proceso
        if (precio>=2000) {
            descuento=precio*0.10; 
        }else if (precio>=1000 && precio<2000) {
            descuento=precio*0.05;
        }else if (precio>=500 && precio<1000) {
            descuento=precio*0.02;
        }else{
            descuento=precio*0;
        }
        total=precio-descuento;
        igv=total*0.18;
        preFi=total+igv;
        //Datos de salida
        System.out.println("El IGV total es: "+igv);
        System.out.println("El descuento total es: "+descuento);
        System.out.println("El total a pagar es: "+preFi);
}
    public static void pregunta3JSTC() {
        //Definir variables
       double num1,num2,total;
       String signo;
       //Datos de entrada
       System.out.println("Ingrese el primer numero: ");
       num1=lt.nextDouble();
       System.out.println("Ingrese el segundo numero: ");
       num2=lt.nextDouble();
       System.out.println(" + = suma \n - = resta \n / = divicion \n * = multiplicacion \n ^ = potencia \n R = raiz \n % = modulo de 2 \n Ingrese el signo: ");
       signo=lt.next();
       //Proceso
       if (signo=="+") {
        total=num1+num2;
       } else if(signo=="-"){
        total=num1-num2;
       }else if(signo=="/"){
        total=num1/num2;
       }else if (signo=="*") {
        total=num1*num2;
       }else if (signo=="^") {
        total=Math.pow(num1,num2);
       }else if (signo=="R") {
        total=Math.pow(num1,0.5);
       }else{
        total=num1%num2;
       }
       //Datos de salida
       System.out.println("El resultado es: "+total);
   }
    public static void pregunta4JSTC() {
        //Definir variable
        double edad;
        String mensaje,genero;
        //Datos de entrada
        System.out.println("Ingrese la cantidad de años: ");
        edad=lt.nextDouble();
        System.out.println("Ingrese el genero(masculino o femenino)");
        genero=lt.next();
        //proceso
        if (edad>=70) {
            mensaje=("Su vacuna es de tipo C");
        }else if (edad>=16 && edad<70 && genero=="masculino") {
            mensaje=("Su vacuna es de tipo A");
        }else if (edad>=16 && edad<70 && genero=="femenino") {
            mensaje=("Su vacuna es de tipo B");
        }else{
            mensaje=("Su vacuna es de tipo A");
        }
        //Datos de salida
        System.out.println(mensaje);
}
public static void main(String[] args) {
        //Definir variable
        int numero;
        System.out.println("Ingrese el numero del ejercicio que quiere ejecutar: ");
        numero=lt.nextInt();
        switch (numero) {
            case 1: pregunta1JSTC(); break;
            case 2: pregunta2JSTC(); break;
            case 3: pregunta3JSTC(); break;
            case 4: pregunta4JSTC(); break;
            default: break;
        }
}
}