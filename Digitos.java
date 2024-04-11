import java.util.Scanner;

public class Digitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa un numero positivo de uno o dos digitos (1..99):");
        int numero = scanner.nextInt();
        
        if (numero >= 1 && numero <= 9) {
            System.out.println("El numero tiene un digito.");
        } else if (numero >= 10 && numero <= 99) {
            System.out.println("El numero tiene dos digitos.");
        } else {
            System.out.println("El numero ingresado no está dentro del rango especificado.");
        }
    }
}