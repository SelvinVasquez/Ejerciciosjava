import java.util.Scanner;
class DiasSemana {
    public String obtenerDiaSemana(int numero) {
        String nombreDia;

        switch (numero) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            default:
                nombreDia = "Número inválido, ingrese un número del 1 al 5";
                break;
        }

        return nombreDia;
    }
}

public class dia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese un número del 1 al 5: ");
        numero = scanner.nextInt();
        DiasSemana diasSemana = new DiasSemana();
        String nombreDia = diasSemana.obtenerDiaSemana(numero);
        System.out.println("El día correspondiente al número " + numero + " es: " + nombreDia);
    }
}