public class OperacionesMatematicas {
    
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
    
    // Ejemplo de uso
    public static void main(String[] args) {
        OperacionesMatematicas operaciones = new OperacionesMatematicas();
        
        // Ejemplos de sumar
        System.out.println("Suma de enteros: " + operaciones.sumar(5, 3));
        System.out.println("Suma de decimales: " + operaciones.sumar(2.5, 3.7));
        
        // Ejemplos de restar
        System.out.println("Resta de enteros: " + operaciones.restar(8, 3));
        System.out.println("Resta de decimales: " + operaciones.restar(5.8, 2.3));
        
        // Ejemplos de multiplicar
        System.out.println("Multiplicacion de enteros: " + operaciones.multiplicar(4, 5));
        System.out.println("Multiplicacion de decimales: " + operaciones.multiplicar(2.5, 3.5));
        
        // Ejemplos de dividir
        System.out.println("Division de enteros: " + operaciones.dividir(10, 2));
        System.out.println("Division de decimales: " + operaciones.dividir(10.5, 2.0));
    }
}