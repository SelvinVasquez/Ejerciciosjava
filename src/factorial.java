import java.util.Scanner;
class calcularFactorial {
    public long calcularFactoriala(int numero) {
        long factorial = 1;
        int i = numero;
        while (i > 1) {
            factorial *= i;
            i--;
        }
        return factorial;
    }
}

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        calcularFactorial factorial = new calcularFactorial();
        long resultado = factorial.calcularFactoriala(numero);
        System.out.println("El factorial de " + numero + " es: " + resultado);
    }
}
