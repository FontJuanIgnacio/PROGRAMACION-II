import java.util.Scanner;

public class PromedioAlumno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la nota del primer parcial:");
        double notaParcial1 = scanner.nextDouble();

        System.out.println("Ingrese la nota del segundo parcial:");
        double notaParcial2 = scanner.nextDouble();

        System.out.println("Ingrese la nota del tercer parcial:");
        double notaParcial3 = scanner.nextDouble();

        // Calculamos el promedio de las tres notas
        double promedio = (notaParcial1 + notaParcial2 + notaParcial3) / 3;

        // Verificamos si el promedio es mayor o igual a 8 para determinar si está promocionado
        if (promedio >= 8) {
            System.out.println("El alumno esta promocionado con un promedio de " + promedio);
        } else {
            System.out.println("El alumno no esta promocionado, su promedio es " + promedio);
        }

        scanner.close();
    }
}