import java.util.Scanner;
/**
 * Ejercicio320
 */
public class Ejercicio320 {

    public static void main(String[] args) {
        //Declarar variables
        int talla;
        double  cantTela, costTela, cantPant, pbase=0, utilUni, pfinal, utilTotal,cantTP;
        String modelo;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese el modelo: ");
        modelo=lt.next();
        System.out.println("Ingrese talla a confeccionar: ");
        talla=lt.nextInt();
        System.out.println("Cantidad de tela: ");
        cantTela=lt.nextDouble();
        System.out.println("Costo tela por metro: ");
        costTela=lt.nextDouble();
        System.out.println("Metro Tela x Pantalon: ");
        cantTP=lt.nextDouble();
        //Proceso
        cantPant=Math.round(costTela/cantTP);
        if (modelo.equals("A")) {
            if (talla==32 || talla ==36) {
                pbase=(costTela*0.8)+costTela*0.04;
            }else{
                pbase=(costTela*0.8)+costTela; 
            }
            
        } else {
            if (talla==32 || talla ==36) {
                pbase=(costTela*0.95)+costTela*0.04;
            }else{
                pbase=(costTela*0.95)+costTela; 
            }
        }
        utilUni=pbase*0.3;
        pfinal=utilUni+pbase;
        utilTotal=utilUni*cantPant;
        //Datos salida
        System.out.println("Precio de cada pantalon: "+pfinal);
        System.out.println("Utilidad total: "+utilTotal);


    }

    
}