import java.util.Scanner; /*P11-programa obtiene el factorial del x numero*/
public class factorial {
    public static void main(String args[]){
        Scanner ent = new Scanner(System.in);
        int i, n, fac=1;
        System.out.print("Desea encontrar el factorial de : ");
        n =ent.nextInt();
        for( i=1; i<=n; i++){
            fac=fac*i;
        }
        System.out.printf("El factorial de %1$d es: %2$d", n, fac);
    }
}