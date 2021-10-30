package tuan4;

import java.util.Scanner;

public class Bai7 {

    public static void main(String[] args) {
        System.out.println("20181075_Dao Trong Vui_Malop:709155");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập dãy ký tự: ");
        String n = scanner.nextLine();
        String[] arr = n.split("");
        System.out.print("Số ban đầu: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (isCheckKyTu(arr[i])) {
                arr[i] = "$";
            }
        }
        System.out.println("");
        System.out.print("Số lúc sau: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("");
    }

    public static boolean isCheckKyTu(String input) {
        String mang[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        for (int i = 0; i < mang.length; i++) {
            if (input.equals(mang[i])) {
                return true;
            }
        }
        return false;
    }
}
