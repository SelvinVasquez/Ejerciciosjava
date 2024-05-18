import java.util.Scanner;
class Impares {
    public void mostrarImpart(int numero) {
        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

public class Bucle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        while (true) {
            System.out.print("Ingrese un número mayor a 10 y menor que 30: ");
            numero = scanner.nextInt();
            if (numero > 10 && numero < 30) {
                break;
            } else {
                System.out.println("Número fuera del rango. Intente de nuevo.");
            }
        }
        Impares impares = new Impares();
        System.out.println("Los números impares desde 1 hasta " + numero + " son:");
        impares.mostrarImpart(numero);
    }
}