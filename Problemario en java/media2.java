import java.util.Scanner; /*P10-programa que saca la media de 20 numeros de porsitivos y negativos*/
public class media2 {
    public static void main(String args[]){
        Scanner ent = new Scanner(System.in);
        int i, y=1, x=1;
        float e, prompo=0, promneg=0;
        for( i=1; i<=20; i++){
            System.out.printf("Introduce el %d numero: ",i);
            e = ent.nextFloat();
            if (e>=0){
                prompo= prompo + e;
                x++;
            }
            else{
                promneg = promneg + e;
                y++; 
            }
        }
        x--;
        y--;
        promneg=promneg/y;
        prompo=prompo/x;
        System.out.printf("--Total de positivos--\n Positivos: %1$d \n Promedio de los positivos: %2$.2f \n --Total de negativos--\n Negativos: %3$d\n Promedio de los negativo: %4$+f",x,prompo,y,promneg);
    }
}