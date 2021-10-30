package tuan3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai5 {

    public static void main(String[] args) {
        System.out.println("20181075_Dao Trong Vui_Malop:709155");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài của dãy số:");
        int n = scanner.nextInt();
        System.out.print("Nhập số:");
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            int nhap = scanner.nextInt();
            b[i] = nhap;
        }
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
            if (isCheck(b, b[i])) {
                c.add(b[i]);
            };
            if (isCheckHopso(b, b[i]) == false) {
                d.add(b[i]);
            }
        }
        System.out.println("Nguyên tố: " + c.size());
        System.out.println("Hợp số: " + d.size());
    }

    public static boolean isCheck(int b[], int input) {
        boolean KT = true;
        if (input == 1) {
            KT = false;
            return KT;
        }
        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                KT = false;
                break;
            }
        }
        return KT;
    }

    public static boolean isCheckHopso(int b[], int input) {
        boolean KT = true;
        if (input == 1) {
            KT = true;
            return KT;
        }
        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                KT = false;
                break;
            }
        }
        return KT;
    }
}
