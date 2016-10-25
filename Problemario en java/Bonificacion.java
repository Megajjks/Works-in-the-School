import java.util.Scanner; /*P5-Bonificacion*/
public class Bonificacion{
    public static void main (String args[]){
        Scanner ent = new Scanner(System.in);
        double monto, montoneto;
        System.out.print("Intotroduce el monto generado: ");
        monto = ent.nextDouble();
        if (monto <=1000){
            montoneto = (monto*.2)+monto;
        }
        else {
            if ((monto>1000)&&(monto<=2000)){
                montoneto = (monto*.3)+monto;
            }
            else{
                if((monto>2000)&&(monto<=3000)){
                    montoneto = (monto*.4)+monto;
                }
                else{
                    if ((monto>3000)&&(monto<=4000)){
                        montoneto = (monto*.5)+monto;
                    }
                    else{
                        montoneto = (monto*.8)+monto;
                    }
                }
            }
        } 
        System.out.printf("El monto neto del empleado sera: $ %.2f  cantidad de dinero generada", montoneto);      
    }
}