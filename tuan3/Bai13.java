package tuan3;

import java.util.Scanner;

public class Bai13 {

    static int count = 0;

    public static void main(String[] args) {
        System.out.println("20181075_Dao Trong Vui_Malop:709155");
        init();
    }

    public static void init() {
        int[][] matrix;
        int m, n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        n = scanner.nextInt();
        matrix = new int[n][n];
        topRight(matrix, 0, 0, n - 1, n - 1);
        display(matrix);
    }

    public static void topRight(int matrix[][], int x1, int y1, int x2, int y2) {
        for (int i = x1; i <= x2; i++) {
            matrix[y1][i] = count++;
        }
        for (int i = y1 + 1; i <= y2; i++) {
            matrix[i][x2] = count++;
        }
        if (x2 - x1 > 0 && y2 - y1 > 0) {
            y1++;
            x2--;
            bottomLeft(matrix, x1, y1, x2, y2);
        }
    }

    public static void bottomLeft(int matrix[][], int x1, int y1, int x2, int y2) {
        for (int i = x2; i >= x1; i--) {
            matrix[y2][i] = count++;
        }
        for (int i = y2 - 1; i >= y1; i--) {
            matrix[i][x1] = count++;
        }
        if (x2 - x1 > 0 && y2 - y1 > 0) {
            y2--;
            x1++;
            topRight(matrix, x1, y1, x2, y2);
        }
    }

    public static void display(int matrix[][]) {
        for (int[] x : matrix) {
            for (int i : x) {
                System.out.printf("%5d", i);
            }
            System.out.println("\n");
        }
    }
}
