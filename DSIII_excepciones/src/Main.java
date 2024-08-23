import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cadena cadena = new Cadena();

        // Parte I: Pide un string y una posición. Luego regresa el caracter en esa posicion,
        // sino hay ninguno manda una excepción
        System.out.print("Introduce una cadena de texto: ");
        String primerString = scanner.nextLine();

        System.out.print("Introduce una posición: ");
        int posicion = scanner.nextInt();
        scanner.nextLine();  // Consumir el salto de línea

        try {
            char resultado = cadena.caracterEn(primerString, posicion);
            System.out.println("El carácter en la posición " + posicion + " es: " + resultado);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Parte II: Pide un segundo string y muestra el carácter en la posición 7.
        // Si la cadena es menor a 7 manda una excepción
        System.out.print("Introduce un segundo texto: ");
        String segundoString = scanner.nextLine();

        try {
            if (segundoString.length() < 7) {
                throw new Exception("Has intentado recuperar una posición de la cadena de caracteres que no existe.");
            } else {
                char resultado = cadena.caracterEn(segundoString, 7);
                System.out.println("El carácter en la posición 7 del segundo string es: " + resultado);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // Parte III: Solicita un valor numérico, calcula la raiz si es positivo y mayor o igual a 0,
        // de lo contrario mandamos una excepción
        System.out.print("Introduce un valor numérico: ");
        double valor = scanner.nextDouble();

        try {
            if (valor < 0) {
                throw new NumeroNegativoExcepcion();
            } else {
                double raizCuadrada = Math.sqrt(valor);
                System.out.println("La raíz cuadrada de " + valor + " es: " + raizCuadrada);
            }
        } catch (NumeroNegativoExcepcion e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
