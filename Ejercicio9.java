import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        String cadena;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el texto: ");
        cadena = sc.nextLine();
        System.out.println("El texto en mayusculas: " + (cadena.toUpperCase()));
        System.out.println("El texto en minusculas: " + (cadena.toLowerCase()));
    }
}
