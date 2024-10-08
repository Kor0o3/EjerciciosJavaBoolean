import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nRojas, nVerdes, nAzules, nHojas;

        System.out.print("Ingrese el numero de hojas del cuaderno: ");
        nHojas = sc.nextInt();

        nAzules = nHojas/3;
        nRojas = ((nHojas%3)!=0) ? (nHojas/3)+1 : (nHojas/3);
        nVerdes =  ((nHojas%3)==2) ? (nHojas/3)+1 : (nHojas/3);

        System.out.println("Resultado: ");
        System.out.println("Hojas rojas: "+ nRojas);
        System.out.println("Hojas verdes: "+ nVerdes);
        System.out.println("Hojas azules: "+ nAzules);
    }
}
