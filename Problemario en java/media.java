import java.util.Scanner; /*P10-programa que saca la media de una determinada cantidad de numeros*/
public class media {
    public static void main(String args[]){
        Scanner ent = new Scanner(System.in);
        int i, n;
        float e, prom=0;
        System.out.print("¿Cuantos numeros deseas introducir?: ");
        n =ent.nextInt();
        for( i=1; i<=n; i++){
            System.out.printf("Introduce el %d numero: ",i);
            e = ent.nextFloat();
            prom= prom + e;
        }
        prom= prom / n;
        System.out.printf("El promedio de %1$d números es: %2$.2f", n, prom);
    }
}