import java.util.Scanner; /*P3-Programa que obtien el promedio de un estudiante*/
public class promedio{
	public static void main (String args[]){
		Scanner entrada = new Scanner(System.in);
		int i;
		float prom=0, calif;
		for (i =1; i<=3; i++){
			System.out.printf("Digite la calificación n %d: ", i);
			calif = entrada.nextFloat();
			prom = prom+calif;
			}
		prom=prom/3;
		System.out.printf("El promedio general del alumno es: %f", prom);
		}
	}