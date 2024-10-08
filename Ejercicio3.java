import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        double n1, n2;

        Scanner lector = new Scanner(System.in);
        System.out.print("Introduce la altura(m): ");
        n1 = lector.nextDouble();
        System.out.print("Introduce la longitud de lado de la base(m): ");
        n2 = lector.nextDouble();
        System.out.println("El volumen de la piramide es: "+ (((n2*n2)*n1)/3) +" metros cubicos");
        System.out.println("Equivale a: "+ (((n2*n2)*n1)/3)/2500 +" piscinas olimpicas");

    }
}
