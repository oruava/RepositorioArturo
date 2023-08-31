import java.util.Random;

public class Matriz3x3Desordenada {
    public static void main(String[] args) {
        // Declarar la matriz 3x3
        int[][] matriz = new int[3][3];

        // Inicializar la variable numero en 1
        int numero = 1;

        // Llenar la matriz con números del 1 al 10
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = numero;
                numero++;


            }
        }

        // Desordenar la matriz al azar
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int randomI = random.nextInt(3);
                int randomJ = random.nextInt(3);

                // Intercambiar elementos aleatorios en la matriz
                int temp = matriz[i][j];
                matriz[i][j] = matriz[randomI][randomJ];
                matriz[randomI][randomJ] = temp;
            }
        }

        // Imprimir la matriz desordenada
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Saltar a la siguiente fila
        }
    }
}
