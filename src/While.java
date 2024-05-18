import java.util.Scanner;
class Impar {
    public void mostrarImpares(int numero) {
        int i = 1;
        while (i <= numero) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }
}

public class While {
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
        Impar impar = new Impar();
        System.out.println("Los números impares desde 1 hasta " + numero + " son:");
        impar.mostrarImpares(numero);
    }
}