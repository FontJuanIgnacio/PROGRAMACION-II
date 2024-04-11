import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la nota de la materia:");
        double nota = scanner.nextDouble();

        if (nota < 4) {
            System.out.println("Desaprobado");
        } else if (nota >= 4 && nota < 10) {
            System.out.println("Aprobado");
        } else if (nota == 10) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("Nota inválida");
        }

        scanner.close();
    }
}