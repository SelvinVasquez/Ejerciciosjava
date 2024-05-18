import java.util.Scanner;
public class Nummayor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese dos números
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();
        Comparar comparar = new Comparar();
        int mayor = comparar.obtenerMayor(numero1, numero2);

        System.out.println("El mayor de los dos números es: " + mayor);
    }

    static class Comparar {
        public int obtenerMayor(int num1, int num2) {
            if (num1 > num2) {
                return num1;
            } else if (num2 > num1) {
                return num2;
            } else {
                return num1; // En este caso, se devuelve num1 si son iguales
            }
        }
    }
}