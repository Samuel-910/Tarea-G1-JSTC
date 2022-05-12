package EstCondicional;
import java.util.Scanner;

/**
 * Java
 */
public class Java {

    static Scanner teclado=new Scanner(System.in); 

    public static void ejercicio1() {

        int m=2;
        int a=5;
        int multi;
    
        multi= m*a;
        System.out.println(" me la pelas"+multi);
    }
    public static void ejercicio31() {

       int edad;
       //datos de entrada
       System.out.print("Ingrese su edad:");
       edad=teclado.nextInt();
       // proceso y datos de salida
       if (edad>18) {
            System.out.println(" Puede votar porque su edad es"+edad);
           
       } else {
            System.out.println(" Ustede No puede votar porque su edad es"+edad);
           
       }
       
    }
    public static void ejercicio316() {

        int puntos;
        double bono=0;
        double sueldomin;

        // datos de entrada

        System.out.print("Ingrese la puntuacion del docente:");
        puntos=teclado.nextInt();

        System.out.print("Ingrese el sueldo minimo:");
        sueldomin=teclado.nextDouble();
        
        //proceso y datos de salida

        if (puntos>=0 && puntos<100) {

            bono=sueldomin;

        }else if (puntos>=101 && puntos<=150) {
            bono=2*sueldomin;
            
        }else{
            bono=3*sueldomin;
        }

        //datos de salida

        System.out.println("El bono que obtuvo el profesor es:"+bono);
        
    }
    public static void ejercicio32() {
        
        double pagohora;
        int cantidadhora;
        double sueldomensual;

        //datos de entrada

        System.out.println("Ingrese el costo por hora:");
        pagohora=teclado.nextDouble();

        System.out.println("Ingrese cantidad de horas trabajadas en la semana:");
        cantidadhora=teclado.nextInt();

        //proceso y datos de salida

        if (cantidadhora>40) {

            sueldomensual=40 * pagohora + 2 * (( cantidadhora - 40 ) * pagohora );
            
        } else {

            sueldomensual=cantidadhora*pagohora;
        }

        //datos de salida

        System.out.println("El sueldo del trabajador es : "+sueldomensual);

    }
    public static void ejercicio35() {

        //declarar variables

        String nombre1, nombre2, nombre3;
        int edad1, edad2, edad3;
        String menorpersona;
        int menoredad;

        //datos de entrada

        System.out.println("Ingrese nombre 1:");
        nombre1=teclado.next();
        System.out.println("Ingrese edad de persona 1:");
        edad1=teclado.nextInt();
        
        System.out.println("Ingrese nombre 2:");
        nombre2=teclado.next();
        System.out.println("Ingrese edad de persona 2:");
        edad2=teclado.nextInt();

        System.out.println("Ingrese nombre 3:");
        nombre3=teclado.next();
        System.out.println("Ingrese edad de persona 3:");
        edad3=teclado.nextInt();

        //proceso

        if (edad1<edad2 && edad1<edad3) {
            menoredad=edad1;
            menorpersona=nombre1;
        }else if (edad2<edad1 && edad2<edad3){
            menoredad=edad2;
            menorpersona=nombre2;

        }else{
            menoredad=edad3;
            menorpersona=nombre3;
        }
        
        // datos de salida 
        System.out.println("la persona con menor edad es: "+menoredad+" y se llama "+menorpersona);
    }
    public static void ejercicio38() {
        // declarar variables

        int anhoAnti;
        Double sueldo;
        Double bonoAnti=0.0;
        Double bonoSueldo;
        Double bonoMayor=0.0;

        // Datos de entrada

        System.out.println("Ingrese anho de antiguedad:");
        anhoAnti=teclado.nextInt();

        System.out.println("Ingrese el sueldo reciente:");
        sueldo=teclado.nextDouble();

        //proceso y datos de salida

        if (anhoAnti>2 && anhoAnti<5) {
            bonoAnti=sueldo*0.20;

        }else if(anhoAnti>=5){
            bonoAnti=sueldo*0.30;

        }

        if (sueldo > 3500) {

            bonoSueldo=sueldo*0.10;

        }else if(sueldo>=1000 && sueldo<=3500){
            bonoSueldo=sueldo*0.15;

        }else{
            bonoSueldo=sueldo*0.25;
        }

        if (bonoAnti>bonoSueldo) {
            bonoMayor=bonoAnti;
            
        }else{
            bonoMayor=bonoSueldo;
        }

        //datos de salida

        System.out.println("El Bono que corresponde es: "+bonoMayor);
    
    }
    public static void main(String[] args) {
        //ejercicio31();

        //ejercicio316();

        //ejercicio32();

        //ejercicio35();

        ejercicio38();
    }
}
