import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, apellido1, apellido2;

        System.out.print("Ingresa el nombre: ");
        nombre = sc.nextLine();
        nombre = nombre.trim();
        System.out.print("Ingrese el primera apellido: ");
        apellido1 = sc.nextLine();
        apellido1 = apellido1.trim();
        System.out.print("Ingresa el segundo apellido: ");
        apellido2 = sc.nextLine();
        apellido2 = apellido2.trim();

        boolean nombreValido = (nombre.charAt(0) + "").equalsIgnoreCase(nombre.charAt(nombre.length() - 1)+ "");
        boolean apellidoValido = apellido1.length() == apellido2.length();

        System.out.println("Resultado:");
        System.out.println((nombreValido && apellidoValido)
                ? (nombre +" "+ apellido1 +" "+ apellido2 +". Persona APTA para participar en el concurso")
                : (nombre +" "+ apellido1 +" "+ apellido2 +". Persona NO APTA para participar en el concurso"));
    }
}
