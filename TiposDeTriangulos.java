import java.util.Scanner;

public class TiposDeTriangulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el numero de triangulos a evaluar: ");
        int n = scanner.nextInt();
        
        int equilateros = 0;
        int isosceles = 0;
        int escalenos = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.println("\nTriangulo #" + i);
            System.out.print("Ingrese la longitud del lado 1: ");
            double lado1 = scanner.nextDouble();
            System.out.print("Ingrese la longitud del lado 2: ");
            double lado2 = scanner.nextDouble();
            System.out.print("Ingrese la longitud del lado 3: ");
            double lado3 = scanner.nextDouble();
            
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Este es un triangulo equilatero.");
                equilateros++;
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Este es un triangulo isosceles.");
                isosceles++;
            } else {
                System.out.println("Este es un triangulo escaleno.");
                escalenos++;
            }
        }
        
        System.out.println("\nCantidad de triangulos de cada tipo:");
        System.out.println("Equilateros: " + equilateros);
        System.out.println("Isosceles: " + isosceles);
        System.out.println("Escalenos: " + escalenos);
        
        // Determinar el tipo de triangulo que posee menor cantidad
        String tipoMenorCantidad;
        int menorCantidad = Math.min(Math.min(equilateros, isosceles), escalenos);
        
        if (menorCantidad == equilateros && equilateros != isosceles && equilateros != escalenos) {
            tipoMenorCantidad = "Equilateros";
        } else if (menorCantidad == isosceles && isosceles != equilateros && isosceles != escalenos) {
            tipoMenorCantidad = "Isosceles";
        } else if (menorCantidad == escalenos && escalenos != equilateros && escalenos != isosceles) {
            tipoMenorCantidad = "Escalenos";
        } else {
            tipoMenorCantidad = "Los tres tipos de triangulos poseen la misma cantidad";
        }
        
        System.out.println("\nEl tipo de triangulo que posee menor cantidad es: " + tipoMenorCantidad);
        
        scanner.close();
    }
}