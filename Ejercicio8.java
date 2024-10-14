import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        String pl;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe una palabra: ");
        pl = sc.nextLine();
        System.out.println("Su longitu es: "+(pl.length()));
    }
}
