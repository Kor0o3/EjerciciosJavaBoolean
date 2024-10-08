import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        double n1, n2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Primer numero: ");
        n1 = sc.nextDouble();
        System.out.println("Segundo numero: ");
        n2 = sc.nextDouble();
        System.out.println("El doble del segundo numero es: " + n2*2);
        System.out.println("La tercera parte del primer numero es: " + n1/3);
        System.out.println("El cuadrado de la suma es: " + ((n1+n2)*(n1+n2)));
        System.out.println("La decima parte de la suma es: " + (((n1*n1)+(n2*n2))/10.0));
    }
}
