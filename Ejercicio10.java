import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio, fin;

        System.out.print("Introduce una palabra: ");
        String palabra = sc.nextLine();
        System.out.print("Intruce el inicio de la cadena: ");
        inicio = sc.nextInt();
        System.out.print("Intruce el fin de la cadena: ");
        fin = sc.nextInt();

        System.out.println("La cadena original es: "+(palabra));
        System.out.println("La subcadena es: "+(palabra.substring(inicio, fin+1)));
    }
}
