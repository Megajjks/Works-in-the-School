import java.util.Scanner; /*P8-Programa que suma los números enteros del 1 al 100*/
public class sumador{
    public static void main(String args[]){
        int suma=0;
        for (int i=1; i<=100; i++){
        suma=suma+i;
     }
     System.out.printf("La suma de los enteros del 1 al 100 es: "+suma);
    }
}