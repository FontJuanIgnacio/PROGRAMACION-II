import java.util.Scanner;

public class CuadrantePunto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese las coordenadas x e y
        System.out.println("Ingrese la coordenada x del punto:");
        int x = scanner.nextInt();
        
        System.out.println("Ingrese la coordenada y del punto:");
        int y = scanner.nextInt();
        
        // Verificar si el punto se encuentra en el origen
        if (x == 0 && y == 0) {
            System.out.println("El punto se encuentra en el origen.");
        } else if (x > 0 && y > 0) {
            System.out.println("El punto se encuentra en el primer cuadrante.");
        } else if (x < 0 && y > 0) {
            System.out.println("El punto se encuentra en el segundo cuadrante.");
        } else if (x < 0 && y < 0) {
            System.out.println("El punto se encuentra en el tercer cuadrante.");
        } else if (x > 0 && y < 0) {
            System.out.println("El punto se encuentra en el cuarto cuadrante.");
        } else {
            System.out.println("El punto no se encuentra en ningún cuadrante.");
        }
        
        scanner.close();
    }
}