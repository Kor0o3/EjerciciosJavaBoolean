import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
    int n1;

        System.out.println("Analisis de numero: ");
        System.out.println("____________________________________");
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        n1 = lector.nextInt();

        boolean igualcero = n1 == 0;
        boolean espositivo = n1 > 0;
        boolean menor100 = n1 < 100;
        boolean espar = n1 % 2 ==  0;

        System.out.println("RESULTADO");
        System.out.println("____________________________________");
        System.out.println("El numero es cero: "+ igualcero);
        System.out.println("El numero es positivo: "+espositivo);
        System.out.println("El numero es menor que 100: "+menor100);
        System.out.println("El numero es par: "+espar);
    }
}
