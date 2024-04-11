import java.util.Scanner;

public class TrimestreDelAnio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el dia:");
        int dia = scanner.nextInt();

        System.out.println("Ingrese el mes:");
        int mes = scanner.nextInt();

        System.out.println("Ingrese el anio:");
        int año = scanner.nextInt();

        int trimestre = obtenerTrimestre(mes);

        System.out.println("El dia " + dia + " del mes " + mes + " del anio " + año + " corresponde al trimestre " + trimestre + " del anio.");
    }

    public static int obtenerTrimestre(int mes) {
        if (mes >= 1 && mes <= 3) {
            return 1;
        } else if (mes >= 4 && mes <= 6) {
            return 2;
        } else if (mes >= 7 && mes <= 9) {
            return 3;
        } else if (mes >= 10 && mes <= 12) {
            return 4;
        } else {
            return -1; // Si el mes no está en el rango valido, devuelve -1
        }
    }
}