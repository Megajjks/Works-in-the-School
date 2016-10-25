import java.util.Scanner; /*P12-programa obtiene las 10 primeras potencias de un numero dado- By jayro Salazar (5871)*/
public class potencias {
    public static void main(String args[]){
        Scanner ent = new Scanner(System.in);
        int i, n; 
        long pot=1;
        System.out.print("Desea encontrar las 10 primeras potencias del numero : ");
        n =ent.nextInt();
        for( i=1; i<=10; i++){
            pot= n*pot;
            System.out.printf("%1$d ^ %2$d = %3$d \n", n, i,pot);
        }
    }
}