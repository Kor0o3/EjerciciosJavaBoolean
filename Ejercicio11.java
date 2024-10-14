import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra con espacios: ");
        String palabra = sc.nextLine();

        System.out.println("La palabra sin espacios es: "+ palabra.replace(" ", ""));
    }
}
