package tuan2;

import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {
        System.out.println("20181075_Dao Trong Vui_Malop:709155");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số:");
        int n = scanner.nextInt();
        int result = Fibonaxi(n);
        System.out.println(result);
    }

    public static int Fibonaxi(int k) {
        if (k == 1) {
            return 1;
        } else if (k == 0) {
            return 0;
        } else {
            return Fibonaxi(k - 1) + Fibonaxi(k - 2);
        }
    }
}
