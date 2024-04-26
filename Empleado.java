import java.util.Scanner;

public class Empleado {
    private String nombre;
    private String apellido;
    private int edad;
    private double salario;

    // Constructor
    public Empleado(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }

    // Método para mostrar información completa del empleado (incluyendo salario)
    public void mostrarInformacionCompleta() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
    }

    // Método para mostrar información completa del empleado (excluyendo salario)
    public void mostrarInformacionSinSalario() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
    }

    // Método para incrementar el salario por un monto fijo
    public void incrementarSalario(double montoIncremento) {
        salario += montoIncremento;
        System.out.println("Salario incrementado a: " + salario);
    }

    // Método para incrementar el salario por un monto fijo y un porcentaje adicional
    public void incrementarSalario(double montoIncremento, double porcentajeDesempeno) {
    double aumento = (salario + montoIncremento)  * porcentajeDesempeno / 100;
    salario = (salario + montoIncremento) + aumento;
    System.out.println("Salario incrementado a: " + salario);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar información del empleado al usuario
        System.out.println("Ingrese el nombre del empleado:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el apellido del empleado:");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese la edad del empleado:");
        int edad = scanner.nextInt();

        System.out.println("Ingrese el salario del empleado:");
        double salario = scanner.nextDouble();

        // Crear un objeto Empleado con la información proporcionada
        Empleado empleado = new Empleado(nombre, apellido, edad, salario);

        // Mostrar información completa del empleado (incluyendo salario)
        empleado.mostrarInformacionCompleta();

        // Mostrar información completa del empleado (excluyendo salario)
        empleado.mostrarInformacionSinSalario();

        // Incrementar el salario por un monto fijo
        System.out.println("Ingrese el monto a incrementar en el salario:");
        double montoIncremento = scanner.nextDouble();
        empleado.incrementarSalario(montoIncremento);

        // Incrementar el salario por un monto fijo y un porcentaje adicional
        System.out.println("Ingrese el porcentaje de desempenio para el incremento:");
        double porcentajeDesempeno = scanner.nextDouble();
        empleado.incrementarSalario(montoIncremento, porcentajeDesempeno);

        scanner.close();
    }
}
