package tuan3;

import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {
        System.out.println("20181075_Dao Trong Vui_Malop:709155");
        int[] a;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        n = scanner.nextInt();
        a = new int[n];
        nhap(a, n);
        System.out.println("Max: " + max(a,n));
    }

    public static void nhap(int a[], int n) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap cac phan tu mang: ");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

    }

    public static void xuat(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static int max(int a[],int n){
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
}
