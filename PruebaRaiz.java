import java.util.Scanner;
public class PruebaRaiz{

    static Scanner leer = new Scanner(System.in);

    public static void main(String args[]){

        System.out.println("Ingrese el valor de a");
        double  a = leer.nextDouble();

        System.out.println("Ingrese el valor de b");
        double b = leer.nextDouble();

        System.out.println("Ingrese el valor de c");
        double c = leer.nextDouble();

        Raices raiz =  new Raices(a,b,c);

        raiz.calcular();
    }
}