public class Ejercicio1 {

    public enum pc {
        MONITOR, TECLADO, RATON, IMPRESORA, ALTAVOCES
    }
    public static void main(String[] args) {

        System.out.println("Partes de un PC");
        System.out.println("-------------------");
        System.out.println("Parte 1: "+ pc.MONITOR);
        System.out.println("Parte 2: "+ pc.TECLADO);
        System.out.println("Parte 3: "+ pc.RATON);
        System.out.println("Parte 4: "+ pc.IMPRESORA);
        System.out.println("Parte 5: "+ pc.ALTAVOCES);

    }
}