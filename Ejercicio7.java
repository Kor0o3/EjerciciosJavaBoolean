import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        String pl;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe una palabra: ");
        pl = sc.nextLine();
        System.out.println("La primera letra es: " +(pl.charAt(0)));
        System.out.println("La ultima letra es: " +(pl.charAt(pl.length()-1)));
    }
}
