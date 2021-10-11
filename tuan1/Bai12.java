package tuan1;

import java.util.Scanner;

public class Bai12 {

    public static void main(String[] args) throws Exception {
        System.out.println("20181075_Dao Trong Vui _Malop:709155");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập N=");
        int n = scanner.nextInt();
        while (nhap(n)) {
            System.out.println("Nhập sai vui lòng nhập lại");
            System.out.print("Nhập N=");
            n = scanner.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }

    public static boolean nhap(int n) {
        if ((n >= 2) && (n <= 10)) {
            return false;
        } else {
            return true;
        }
    }
}
