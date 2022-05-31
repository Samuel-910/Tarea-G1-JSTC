package Recursividad;

/**
 * EjerRecur
 */
public class EjerRecur {
    public static int factorialR(int n) {
        if (n>1) {
            return factorialR(n-1)*n;
        }
        return 1 ;
        
    }
    public static int fibonaciR(int n) {
        if (n>1) {
            return fibonaciR(n-1)+fibonaciR(n-2);
        }
        return n;
        
    }
    public static double potencia(int base, int exponente) {
 
        if (exponente == 0) { 
            return 1; 
        } else if (exponente == 1) { 
            return base; 
        } else if (exponente < 0) { 
            return potencia(base, exponente + 1) / base;
        } else { 
            return base * potencia(base, exponente - 1);
        }


    }
    
    public static void main(String[] args) {
        System.out.println(factorialR(10));
        System.out.println("Fibonacci");
        System.out.println(fibonaciR(8));
        System.out.println("potencia");
        System.out.println(potencia(2, 3));
    }
    
} 