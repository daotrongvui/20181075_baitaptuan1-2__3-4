package tuan3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai2 {

    int a[];

    public boolean KiemTraNguyenTo(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void nhapMang() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scan.nextInt();
        a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhap phan tu thu" + (i + 1) + ": ");
            a[i] = scan.nextInt();
        }
    }

    public void xuatMang() {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }

    public void xuatSoNguyenTo() {
        for (int i = 0; i < a.length; i++) {
            if (KiemTraNguyenTo(a[i])) {
                System.out.print(a[i] + "\t");
            }
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        System.out.println("20181075_Dao Trong Vui_Malop:709155");
        Bai2 kt = new Bai2();
        kt.nhapMang();
        System.out.println("Các số nguyên tố trong mảng đã nhập: ");
        kt.xuatSoNguyenTo();
    }

}
