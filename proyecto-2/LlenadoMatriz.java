import java.util.Scanner;

public class LlenadoMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        System.out.println("Ingrese el tamaño de la matriz: ");
        n=sc.nextInt();
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = (int) (Math.random() * 50 + 1);
            }
        }

        System.out.println("Matriz generada: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " - ");
            }
            System.out.println();
        }
    }
    public static int[][] llenarMatriz(int n) {
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = (int) (Math.random() * 50 + 1);
            }
        }
        return matriz;
    }
    public static void MostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " - ");
            }
            System.out.println();
        }
    }
}
