import java.util.Scanner; /*P4-Programa que compara edades con nombres y muestra el menor*/
public class ComparaEdades{
  public static void main(String args[]){
    Scanner entrada = new Scanner(System.in);
    String name1, names2;
    int edad1, edad2, dife=0;
    System.out.print("Introduce tu nombre: ");
    name1 = entrada.nextLine();
    System.out.print("Introduce tu edad: ");
    edad1 = entrada.nextInt();
    entrada.nextLine(); //Limpiador del buffer y con ello el token
    System.out.print("Introduce tu nombre: ");
    names2 = entrada.nextLine();
    System.out.printf("Introduzce tu edad: ");
    edad2 = entrada.nextInt();
    if (edad1==edad2){
      System.out.print("" +name1 +" y " +names2 +" tienen la misma edad");
    }
    else{
      if(edad1>edad2){
        dife = edad1-edad2;
        System.out.printf("%s es menor por %d años", names2, dife);
      }
      else{
        dife = edad2-edad1;
        System.out.printf("%s es menor por %d años", name1, dife);
      }
    }
  }
}
