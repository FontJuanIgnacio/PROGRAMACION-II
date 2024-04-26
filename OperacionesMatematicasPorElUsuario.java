import java.util.Scanner;

public class OperacionesMatematicasPorElUsuario {
    
    private static Scanner scanner = new Scanner(System.in);
    
    // Método para sumar dos números enteros
    public int sumar(int a, int b) {
        return a + b;
    }
    
    // Método para sumar dos números decimales
    public double sumar(double a, double b) {
        return a + b;
    }
    
    // Método para restar dos números enteros
    public int restar(int a, int b) {
        return a - b;
    }
    
    // Método para restar dos números decimales
    public double restar(double a, double b) {
        return a - b;
    }
    
    // Método para multiplicar dos números enteros
    public int multiplicar(int a, int b) {
        return a * b;
    }
    
    // Método para multiplicar dos números decimales
    public double multiplicar(double a, double b) {
        return a * b;
    }
    
    // Método para dividir dos números enteros
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }
    
    // Método para dividir dos números decimales
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }
    
    public static void main(String[] args) {
        OperacionesMatematicasPorElUsuario operaciones = new OperacionesMatematicasPorElUsuario();
        
        System.out.println("Ingrese el primer numero:");
        double numero1 = scanner.nextDouble();
        
        System.out.println("Ingrese el segundo numero:");
        double numero2 = scanner.nextDouble();
        
        System.out.println("Ingrese la operación a realizar (+, -, *, /):");
        char operacion = scanner.next().charAt(0);
        
        switch (operacion) {
            case '+' -> System.out.println("Resultado: " + operaciones.sumar(numero1, numero2));
            case '-' -> System.out.println("Resultado: " + operaciones.restar(numero1, numero2));
            case '*' -> System.out.println("Resultado: " + operaciones.multiplicar(numero1, numero2));
            case '/' -> {
                try {
                    System.out.println("Resultado: " + operaciones.dividir(numero1, numero2));
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
            default -> System.out.println("Operación no válida.");
        }
    }
}