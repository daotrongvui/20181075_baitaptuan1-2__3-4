package tuan2;

import java.util.*;

public class Bai8 {

    public static int nhap() {
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while (!check) {
            System.out.print(" ");
            try {
                n = input.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("Ban phai nhap so!Hay nhap lai...");
                input.nextLine();
            }
        }
        return (n);
    }

    public static boolean checkSNT(int n) {
        if (n > 1) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static void inSNTNhoNhat(int n) {
        int count = 0;
        System.out.print("\nUoc nguyen to nho nhat cua " + n + " la: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && (checkSNT(i))) {
                System.out.println(i);
                count++;
            }
            if (count == 1) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("20181075_Dao Trong Vui _Malop:709155");
        System.out.print("Nhap n =");
        int n = nhap();
        inSNTNhoNhat(n);
    }
}
