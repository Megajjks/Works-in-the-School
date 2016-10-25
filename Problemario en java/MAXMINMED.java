import java.util.Scanner; /*P7-Programa que determina el num max, min y la media de ellos*/
public class MAXMINMED{
    public static void main(String args[]){
        Scanner ent = new Scanner(System.in);
        int n, max=0, min=10000, med=0, i;
        for (i=1; i<=10; i++){
            System.out.print("introduce un numero: ");
            n = ent.nextInt();
            if(n>=max){
                max=n;
            }
            else{
                if (n<min){
                    min=n;
                }
            }
            med=med+n;
        }
        med=med/10;
        System.out.printf("Dado 10 números: \n La media es: %1$d \n El número máximo es: %2$d \n El mínimo es: %3$d", med,max,min );
    }
}