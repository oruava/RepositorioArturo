import java.util.Scanner;

public class Supermercado {
    public static void main(String[] args) {
        System.out.println("Dime la cantidad de productos: ");
        Scanner sc = new Scanner(System.in);
        int largo = sc.nextInt();
        if (1 <= largo && largo <= 5){
            System.out.println("Largo valido");
            llenarMatriz(CrearMatriz(largo), largo);
        }
        else {
            System.out.println("No valido vegano");
        }
    }
    public static int [][]CrearMatriz(int largo){
        int[][]MatrizSuper = new int [2][largo];
        return MatrizSuper;
    }

    public static int [][]llenarMatriz(int [][]MatrizVacia,int largo){
        int suma150 = 0;
        for (int i = 0; i < largo ; i++) {
            MatrizVacia[0][i]= i;
            MatrizVacia[1][i]=suma150;
            suma150 += 150;
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < largo; j++) {
                System.out.print(MatrizVacia[i][j] + " ");
            }
            System.out.println(); // Saltar a la siguiente fila
        }
        return MatrizVacia;
    }

}
