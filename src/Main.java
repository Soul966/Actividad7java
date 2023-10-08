import java.util.Scanner;
public class Main {

    // Método para leer 20 numeros enteros
    public static void leerNumeros(int[] numeros) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 20 números enteros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        scanner.close();
    }

    // Método para mostrar cada elemento del arreglo junto con su cuadrado y su cubo
    public static void mostrarResultados(int[] numeros) {
        System.out.println("\nResultados:");

        for (int numero : numeros) {
            int cuadrado = numero * numero;
            int cubo = numero * numero * numero;

            System.out.println("Número: " + numero + ", Cuadrado: " + cuadrado + ", Cubo: " + cubo);
        }
    }

    public static void main(String[] args) {

        int[] numeros = new int[20];
        //llamamos al metodo para leer los numeros y le damos el arreglo como dato
        leerNumeros(numeros);

        //llamamos el metodo que calcula y muestra el numero con su cuadrado y cubo
        mostrarResultados(numeros);
    }

    
}