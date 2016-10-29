import java.util.Scanner; /*Programa que recorre un arreglo de 20 enteros y te permite visualizar una posición*/
public class Vector{ //Creamos la clase Vector
    public static void main(String arg[]){ //Definimos la clase
        Scanner ent = new Scanner(System.in); // Creamos un obeto el cual servira para asignar datos de entrada
        int [] vec = new int[20]; //Creamos el vector que nos guardara los datos
        for(int i=0; i<20; i++){ // iniciamos un contador que nos recorrera el vector para rrellenarlo
            System.out.printf("Valor a introducir en la posición #%d: ",i); //Introducimos un valor
            vec[i] =ent.nextInt(); //Posición donde se guarda el valor introducido
        }
        System.out.print("¿Que posición deseas visualizar?"); // Pedimos la posición que se desea visualizar
        int p=ent.nextInt(); // Se guarda la posición deseada en P
        System.out.printf("%d",vec[p]); //Se visualiza la posición deseada en la pantalla
    }
}