import java.util.Scanner;

public class Ejer1_1_ut6 {
    public static final int DIMENSION =6;
    
    public static void cargaArray(int[] vector){
        Scanner teclado= new Scanner(System.in);
        for (int i=0; i<DIMENSION; i++){
            System.out.print("Elemento["+i+"] = ");
            vector[i]= teclado.nextInt();
        }
    }
    
    public static void main(String[] args){
       int[] vector = new int[DIMENSION];
       cargaArray(vector);
       double sumaPar=0, sumaImpar =0;
       int pares=0, impares=0;
       for (int i=0;i<DIMENSION; i++)
            if (i%2==0 ){
               sumaPar+=vector[i];
               pares++;
            }   
            else{
                sumaImpar+=vector[i];
                impares++;
           }
       System.out.printf("Media de los números Pares: %.2f",sumaPar/pares);
       System.out.println();
       System.out.printf("Media de los números Impares: %.2f",sumaImpar/impares);
    }
}
