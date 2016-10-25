import java.util.Scanner; /*P9-Contar numeros entereros positivos dados hasta que den un 0 o negativo*/
public class Cont {
    public static void main(String args[]){
        Scanner ent = new Scanner(System.in);
        int acomulador=0, n;
        do{
            System.out.print("Introduce un numero: ");
            n = ent.nextInt();
            acomulador += 1;
        }
        while ((n>0)&&(n!=0));       
        System.out.printf("Total de numeros enteros positivos contados: " +acomulador);
    }
}