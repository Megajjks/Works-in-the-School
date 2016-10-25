import java.util.Scanner;  /*P2-Comparador de tres números - made for Jayro Jesus Ku Salzar (5871)*/
public class comparador { 
	public static void main (String args[]){
		int n1,n2,n3;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduzca el 1er numero: ");
		n1 = entrada.nextInt();
		System.out.print("Introduzca el 2do numero: ");
		n2 = entrada.nextInt();
		System.out.print("Introduzca el 3er numero: ");
		n3 = entrada.nextInt();
		if((n1>n2)&&(n1>n3)){
			System.out.printf("El numero mayor es: "+n1);
			}
		else{
			if ((n2>n1)&&(n2>n3)){
				System.out.printf("El numero mayor es: "+n2);
				}
			else{
				System.out.printf("El numero mayor es "+n3);
				}
			}
		}
	}