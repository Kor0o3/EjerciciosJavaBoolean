import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int nLargos;
        int nCrol;
        int nEspalda;
        int laPi;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero de largos: ");
        nLargos = sc.nextInt();
        System.out.print("Introduce la longitud de la piscina: ");
        laPi = sc.nextInt();
        nCrol = ((nLargos%2)==0) ? nLargos/2 : (nLargos/2+1);
        nEspalda = nLargos/2;

        System.out.println("El numero de metros en crol: "+ nCrol*laPi);
        System.out.println("El numero de metros en espalda: "+ nEspalda*laPi);
        System.out.println("De un total de: "+ nLargos+nCrol*laPi +" metros");
    }
}
