import java.util.Scanner;

public class CalculadoraFiguras {
    private Scanner scanner;

    public CalculadoraFiguras() {
        scanner = new Scanner(System.in);
    }

    // Método para calcular el área de un cuadrado
    public double calcularAreaCuadrado() {
        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = scanner.nextDouble();
        return lado * lado;
    }

    // Método para calcular el perímetro de un cuadrado
    public double calcularPerimetroCuadrado() {
        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = scanner.nextDouble();
        return 4 * lado;
    }

    // Método para calcular el área de un rectángulo
    public double calcularAreaRectangulo() {
        System.out.print("Ingrese la base del rectangulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectangulo: ");
        double altura = scanner.nextDouble();
        return base * altura;
    }

    // Método para calcular el perímetro de un rectángulo
    public double calcularPerimetroRectangulo() {
    System.out.print("Ingrese la base del rectangulo: ");
    double base = scanner.nextDouble();
    System.out.print("Ingrese la altura del rectangulo: ");
    double altura = scanner.nextDouble();
    return 2 * (base + altura);
    }

    // Método para calcular el área de un círculo
    public double calcularAreaCirculo() {
        System.out.print("Ingrese el radio del circulo: ");
        double radio = scanner.nextDouble();
        return Math.PI * radio * radio;
    }

    // Método para calcular el perímetro de un círculo
    public double calcularPerimetroCirculo() {
        System.out.print("Ingrese el radio del circulo: ");
        double radio = scanner.nextDouble();
        return 2 * Math.PI * radio;
    }

    public static void main(String[] args) {
        CalculadoraFiguras calculadora = new CalculadoraFiguras();

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nSeleccione una opcion:");
            System.out.println("1. Calcular Area de un cuadrado");
            System.out.println("2. Calcular Perimetro de un cuadrado");
            System.out.println("3. Calcular Area de un rectangulo");
            System.out.println("4. Calcular Perimetro de un rectangulo");
            System.out.println("5. Calcular Area de un circulo");
            System.out.println("6. Calcular Perimetro de un circulo");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> System.out.println("Area del cuadrado: " + calculadora.calcularAreaCuadrado());
                case 2 -> System.out.println("Perimetro del cuadrado: " + calculadora.calcularPerimetroCuadrado());
                case 3 -> System.out.println("Area del rectangulo: " + calculadora.calcularAreaRectangulo());
                case 4 -> System.out.println("Perimetro del rectangulo: " + calculadora.calcularPerimetroRectangulo());
                case 5 -> System.out.println("Area del circulo: " + calculadora.calcularAreaCirculo());
                case 6 -> System.out.println("Perimetro del circulo: " + calculadora.calcularPerimetroCirculo());
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no valida");
            }
        } while (opcion != 0);
        
        scanner.close();
    }
}