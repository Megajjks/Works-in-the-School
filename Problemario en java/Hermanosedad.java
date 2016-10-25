import java.util.Scanner; /* P1-programa que determina la diferencia de edades y busca al hermano mayor. made for Jayro Jesus Ku Salazar (5871)*/
public class Hermanosedad
{
	public static void main (String args[])
	{
		Scanner entrada = new Scanner (System.in);
		int Edad1, Edad2, Dife=0;
		System.out.print("Introduce la edad del primer hermano :");
		Edad1 = entrada.nextInt();
		System.out.print("\n Introduce la edad del segundo hermano :");
		Edad2 = entrada.nextInt();
		if (Edad1>Edad2){
			Dife = Edad1-Edad2;
			System.out.printf("El mayor es el hermano 1\n su edad es: %d años \n la diferencia de edades es %d",Edad1,Dife);
		}
		else {
			Dife = Edad2-Edad1;
			System.out.printf("El mayor es el hermano 2\n su edad es: %d años \n la diferencia de edades es %d",Edad2,Dife);
		}
	}
}
