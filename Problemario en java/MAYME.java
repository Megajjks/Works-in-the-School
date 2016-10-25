import java.util.Scanner; /*P6-Programa que cuenta a los mayores y menores de edad del ISC*/
public class MAYME{
    public static void main(String args[]){
        Scanner ent = new Scanner(System.in);
        int i, edad, ma=0, me=0;
        for (i=1; i<=20; i++){
            System.out.printf("Introduce tu edad alumno #"+i +": ");
            edad = ent.nextInt();
            if (edad >=18){
                ma=ma+1;
            }
            else{
                me=me+1;
            }
        }
        System.out.printf("Total de alumnos: 20 \n Mayores de edad: " +ma +" alumno(s) \n Menores de edad: " +me +" alumno(s)");
    }
}