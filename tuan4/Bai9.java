package tuan4;

import java.util.Scanner;

public class Bai9 {

    public static void main(String[] args) {
        System.out.println("20181075_Dao Trong Vui_Malop:709155");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập xâu ký tự S: ");
        String n = scanner.nextLine();
        String[] xauA = n.split("");
        System.out.println("Chỉ số dược đánh từ 0 -> n-1");
        System.out.print("Chỉ số i: ");
        int i = Integer.parseInt(scanner.nextLine());
        System.out.print("Chỉ số j: ");
        int j = Integer.parseInt(scanner.nextLine());

        if (isCheckContains(i, j, xauA)) {
            System.out.println("Một trong 2 chỉ số không nằm trong dãy!\n Vui lòng kiểm tra lại!");
        } else {
            System.out.print("Xâu ban đầu: ");
            for (int h = 0; h < xauA.length; h++) {
                System.out.print(xauA[h]);
            }
            System.out.println("");
            System.out.print("Xâu lúc sau đổi chỗ: ");
            String tmp = xauA[i];
            xauA[i] = xauA[j];
            xauA[j] = tmp;
            for (int h = 0; h < xauA.length; h++) {
                System.out.print(xauA[h]);
            }
        }
        System.out.println("");

    }

    public static boolean isCheckContains(int i, int j, String[] xau) {
        if (i >= xau.length || j >= xau.length) {
            return true;
        } else {
            return false;
        }
    }
}
