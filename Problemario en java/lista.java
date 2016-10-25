import java.util.Scanner; /*P14-programa obtiene la calificación mayor, menor y el promedio del salon en una lista indeterminada- By jayro Salazar (5871)*/
public class lista {
    public static void main(String args[]){
        Scanner ent = new Scanner(System.in); 
        int i, n;
        float ma=0, me=1000, prom=0;
        System.out.print("¿Cuantos alumnos hay en el salon? : ");
        n =ent.nextInt();
        float[] list = new float[n];
        for (i=0; i<n; i++) {
        	System.out.print("Digite la calificación: ");
        	list[i]= ent.nextFloat();
        	if(list[i]>ma){
        		ma=list[i];
        	}
        	if (list[i]<me) {
        		me=list[i];
        	}
        	prom += list[i];
        }
        prom=prom/n;
        System.out.printf("Cantidad de alumnos del salon: %1$d \n La calificación mayor es de: %2$.2f \n La calificación menor es de: %3$.2f \n El promedio general del salon es: %4$.2f", n, ma, me, prom);
    }
}