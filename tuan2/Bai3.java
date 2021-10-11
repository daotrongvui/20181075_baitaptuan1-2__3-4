package tuan2;

import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        System.out.println("20181075_Dao Trong Vui_Malop:709155");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số:");
        int n = scanner.nextInt();
        float result = 0;
        int t = 0;
        int a = 1;
        for (int i = 1; i <= n; i++) {
            a *= i;
            t += a;
            result += (float) 1 / t;
        }
        System.out.println(result);
    }
}
