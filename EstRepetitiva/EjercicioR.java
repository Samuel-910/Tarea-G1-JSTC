package EstRepetitiva;

/**
 * EjercicioRepit
 */
public class EjercicioR {

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
    public static void main(String[] args) {
        System.out.println("Imprime While: "); imprimirWhileN1_20();
        System.out.println("Imprime Dowhile: "); imprimirDowhileN1_20();
        System.out.println("Imprime For: "); imprimirForN1_20();
    }
}