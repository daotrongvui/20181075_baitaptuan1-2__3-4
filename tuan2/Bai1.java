package tuan2;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        System.out.println("20181075_Dao Trong Vui_Malop:709155");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số:");
        int n = scanner.nextInt();
        float result = 0;
        float t = 0;
        for (int i = 1; i <= n; i++) {
            t = t + i;
            result += (float) (1 / t);
        }
        System.out.println(result);
    }
}
