package tuan3;

import java.util.Scanner;

public class Bai12 {

    public static void main(String[] args) {
        System.out.println("20181075_Dao Trong Vui_Malop:709155");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài số A:");
        int n = scanner.nextInt();
        int[] dayA = new int[n];
        System.out.print("Nhập dãy số A:");
        for (int i = 0; i < n; i++) {
            int nhap = scanner.nextInt();
            dayA[i] = nhap;
        }
        System.out.print("Nhập độ dài số B:");
        int m = scanner.nextInt();
        System.out.print("Nhập dãy số B:");
        int[] dayB = new int[m];

        for (int i = 0; i < m; i++) {
            int nhap = scanner.nextInt();
            dayB[i] = nhap;
        }
        if (isContains(dayA, dayB)) {
            System.out.println("B contains A");
        } else {
            System.out.println("B no contains A");
        }
    }

    public static boolean isContains(int[] a, int[] b) {
        boolean result = false;
        int sizeA = a.length;
        int sizeB = b.length;
        if (sizeA > sizeB) {
            return result;
        }
        for (int i = 0; i < sizeB; i++) {
            if (b[i] == a[0] && (sizeB - i) >= sizeA) {
                int k = i;
                for (int j = 0; j < sizeA; j++) {
                    if (a[j] == b[k]) {
                        result = true;
                        ++k;
                    } else {
                        break;
                    }
                }
            }
        }
        System.out.println(result);
        return result;
    }
}
