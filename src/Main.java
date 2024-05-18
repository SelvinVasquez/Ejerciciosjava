import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingrese su edad: ");
        int edad = scanner.nextInt();
        Persona persona = new Persona(edad);

        // Determinar si es mayor de edad y mostrar el resultado
        if (persona.esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad.");
        } else {
            System.out.println("La persona es menor de edad.");
        }

        scanner.close();
    }

    public static class Persona {
        private int edad;

        public Persona(int edad) {
            this.edad = edad;
        }
        public boolean esMayorDeEdad() {
            return this.edad >= 18;
        }
        public int getEdad() {
            return edad;
        }
        public void setEdad(int edad) {
            this.edad = edad;
        }
    }
}