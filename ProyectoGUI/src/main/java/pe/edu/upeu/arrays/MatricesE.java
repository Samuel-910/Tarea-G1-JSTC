package pe.edu.upeu.arrays;

public class MatricesE {
    public void matricesFBasico() {
        int notas[][];//Declarar matriz
        int [][]notasx;
        notas=new int[2][2];//Tamaño 
        notas[0][0]=20;//Colocando valores
        notas[0][1]=18;
        notas[1][0]=16;
        notas[1][1]=10;
        System.out.println(notas[1][1]);//Mostrar nota
        System.out.println("Cant filas"+notas.length);
        System.out.println("Cant filas"+notas[0].length);
        for (int f = 0; f < notas.length; f++) {
            for (int c = 0; c < notas[0].length; c++) {
                System.out.print(notas[f][c]+"\t");
        
            }
            
        }
    }

    public static void main(String[] args) {
        new MatricesE().matricesFBasico();
    }



}
